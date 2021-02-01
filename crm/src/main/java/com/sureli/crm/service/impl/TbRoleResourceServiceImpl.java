package com.sureli.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.crm.bean.TbResource;
import com.sureli.crm.bean.TbRoleResource;
import com.sureli.crm.bean.TbRoleResourceExample;
import com.sureli.crm.bean.TbRoleResourceExample.Criteria;
import com.sureli.crm.mapper.TbRoleResourceMapper;
import com.sureli.crm.service.TbRoleResourceService;
@Service
public class TbRoleResourceServiceImpl implements TbRoleResourceService {
	@Autowired
	TbRoleResourceMapper roleResourceMapper;

	@SuppressWarnings("null")
	@Override
	public List<Long> findAllByRoleId(Long roleId) {
		List<Long> resultList = new ArrayList<Long>();
		TbRoleResourceExample example = new TbRoleResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		List<TbRoleResource> getList =  roleResourceMapper.selectByExample(example);
		for (TbRoleResource tbRoleResource : getList) {
			resultList.add(tbRoleResource.getResourceId());
		}
		return resultList;
	}

}
