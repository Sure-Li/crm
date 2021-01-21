package com.sureli.crm.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.crm.bean.TbDictionary;
import com.sureli.crm.service.TbDictionaryService;

@Controller
public class HelloController {
	@Autowired
	TbDictionaryService dictionaryService;
	
	@RequestMapping({ "/", "index" })
	public String goindex() {
		return "hello";
	}
	@RequestMapping( "/add" )
	public ModelAndView goAdd(ModelAndView modelAndView) {
		List<TbDictionary> dictionaryList = dictionaryService.finall();
		modelAndView.addObject("dictionaryList", dictionaryList);
		modelAndView.setViewName("client/add");
		return modelAndView;
	}
	
}
