package com.sureli.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sureli.crm.bean.TbUser;
import com.sureli.crm.bean.TbUserExample;
import com.sureli.crm.bean.TbUserExample.Criteria;
import com.sureli.crm.layuiresult.LayuiResult;
import com.sureli.crm.mapper.TbUserMapper;
import com.sureli.crm.service.TbUserService;
import com.sureli.crm.util.page.PageRequest;
import com.sureli.crm.util.page.PageResult;
import com.sureli.crm.util.page.PageUtils;

@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbUserMapper userMapper;

	@Override
	public LayuiResult doUserLogin(String userCode, String userPassword,int pageNum) {
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserCodeEqualTo(userCode);
		criteria.andUserPasswordEqualTo(userPassword);
		List<TbUser> userGet = userMapper.selectByExample(example);
		LayuiResult resulut = new LayuiResult();
		if (userGet.size() > 0) {
			resulut.setCode(0);
			resulut.setData(userGet);
		} else {
			resulut.setCode(1);
			resulut.setMsg("请确认密码");
		}

		return resulut;
	}

	@Override
	public TbUser findUserByRowId(Long rowId) {
		return userMapper.selectByPrimaryKey(rowId);
	}

	@Override
	public PageResult findPage(PageRequest pageQuery) {
		return PageUtils.getPageResult(pageQuery, getPageInfo(pageQuery));
	}
	
	 /**
     * 调用分页插件完成分页
     * @param pageQuery
     * @return
     */
    private PageInfo<TbUser> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<TbUser> sysMenus = userMapper.selectByPage();
        System.out.println("||||||||||||"+sysMenus);
        return new PageInfo<TbUser>(sysMenus.subList(0, sysMenus.size()));
    }
}
