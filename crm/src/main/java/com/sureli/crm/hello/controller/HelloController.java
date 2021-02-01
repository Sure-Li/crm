package com.sureli.crm.hello.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.crm.bean.TbDictionary;
import com.sureli.crm.bean.TbResource;
import com.sureli.crm.bean.TbSystemSetting;
import com.sureli.crm.bean.TbUser;
import com.sureli.crm.layuiresult.LayuiResult;
import com.sureli.crm.service.TbDictionaryService;
import com.sureli.crm.service.TbResourceService;
import com.sureli.crm.service.TbRoleResourceService;
import com.sureli.crm.service.TbSystemSettingService;
import com.sureli.crm.service.TbUserService;
import com.sureli.crm.util.page.PageRequest;
import com.sureli.crm.util.page.PageResult;

import net.sf.json.JSONObject;

@RestController
public class HelloController {
	@Autowired
	TbDictionaryService dictionaryService;
	@Autowired
	TbUserService userService;
	@Autowired
	TbSystemSettingService systemSettingService;
	@Autowired
	TbResourceService resourceService;
	@Autowired 
	TbRoleResourceService roleResourceService;
	
	@RequestMapping({ "/", "index" })
	public ModelAndView goIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("login");
		return modelAndView;
	}
	@RequestMapping("/main/{rowId}")
	public ModelAndView goMain(@PathVariable("rowId") Long rowId,ModelAndView modelAndView) {
		TbUser userGet = userService.findUserByRowId(rowId);
		System.err.println(userGet);
		modelAndView.setViewName("main");
		return modelAndView;
	}
	@RequestMapping( "/dictionary" )
	public ModelAndView goAdd(ModelAndView modelAndView) {
		List<TbDictionary> dictionaryList = dictionaryService.finall();
		modelAndView.addObject("dictionaryList", dictionaryList);
		System.err.println(dictionaryList);
		modelAndView.setViewName("client/add");
		return modelAndView;
	}
	@RequestMapping( "/doAdminLogin" )
	public LayuiResult doAdminLogin(String userCode,String userPassword,HttpSession session) {
		LayuiResult result = userService.doUserLogin(userCode,userPassword,1);
		TbUser userResult = (TbUser) result.getData().get(0);
		Long roleId =  userResult.getRoleId();
		List<Long> resourceIdList = roleResourceService.findAllByRoleId(roleId);
		List<TbResource> resourceList = resourceService.findAllInList(resourceIdList);
		session.setAttribute("resourceList", resourceList);
		return  result;//dictionaryService.doAdminLogin();
	}
	@RequestMapping("/page/{pageNum}/{pageSize}")
	public LayuiResult showPage(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize) {
		System.err.println(pageNum+"---"+pageSize);
		PageRequest pageQuery = new PageRequest();
		pageQuery.setPageNum(pageNum);
		pageQuery.setPageSize(pageSize);
		PageResult pageResult = userService.findPage(pageQuery);
		System.err.println(pageResult);
		LayuiResult result = new LayuiResult(pageResult.getTotalSize(), pageResult.getContent());
		return result;
	}
	@GetMapping("/systemSetting")
	public ModelAndView goSystemSetting(ModelAndView modelAndView) {
		TbSystemSetting systemSettingGet = systemSettingService.findOne();
		modelAndView.addObject("systemSetting", systemSettingGet);
		modelAndView.setViewName("system_setting");
		return modelAndView;
	}
	@GetMapping("/resource")
	public ModelAndView goResource(ModelAndView modelAndView) {
		List<TbResource> resourceList= resourceService.findAll();
		List<String> result = new ArrayList<String>();
		for (TbResource tbResource : resourceList) {
			String get =JSONObject. fromObject(tbResource).toString();
			String out = get.replace("rowId", "id").replace("resourceParentId", "pid");
			result.add(out);
		}
		modelAndView.addObject("resourceList", result);
		System.err.println(result);
		modelAndView.setViewName("resource");
		return modelAndView;
	}
	@GetMapping("updateSystemSetting/{rowId}/{systemSetting}")
	public Integer doUpdateSystemSetting(@PathVariable("rowId") Long rowId,@PathVariable("systemSetting")Integer systemSetting) {
		System.out.println(rowId+systemSetting);
		return systemSettingService.doUpdate(rowId,systemSetting);
	}
}
