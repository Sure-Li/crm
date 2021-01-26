package com.sureli.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.crm.bean.TbUser;
import com.sureli.crm.service.TbUserService;

@RestController
@RequestMapping("/user")
public class TbUserController {
	@Autowired
	private TbUserService userService;

	@GetMapping("/form")
	public ModelAndView getForm(ModelAndView modelAndView) {
		modelAndView.setViewName("user/user_form");
		return modelAndView;
	}
	@PostMapping
	public Integer doAddUser (TbUser user) {
		String createBy = "sys";
		System.out.println(user);
		return userService.doAddUser(user,createBy);
	}
	@PutMapping
	public Integer doEditUserById(TbUser user) {
		System.out.println("doEditUserById");
		return userService.doEditUserById(user);
	}
	@DeleteMapping("/{rowId}")
	public Integer doDeleteUserById(@PathVariable Long rowId) {
		return userService.doDeleteUserById(rowId);
	}
	@GetMapping
	public ModelAndView goIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("user/user_index");
		return modelAndView;
	}
}
