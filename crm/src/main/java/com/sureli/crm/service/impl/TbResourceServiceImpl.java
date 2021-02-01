package com.sureli.crm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.crm.bean.TbResource;
import com.sureli.crm.bean.TbResourceExample;
import com.sureli.crm.bean.TbResourceExample.Criteria;
import com.sureli.crm.mapper.TbResourceMapper;
import com.sureli.crm.service.TbResourceService;
@Service
public class TbResourceServiceImpl implements TbResourceService {
	@Autowired
	TbResourceMapper resourceMapper;

	@Override
	public List<TbResource> findAll() {
		List<TbResource> dictionaryList = new ArrayList<TbResource>();// 只存放父菜单 但是将children属性
		TbResourceExample exampl = new TbResourceExample();
		exampl.setOrderByClause("resource_order");
		Criteria criteria = exampl.createCriteria();
		criteria.andActiveFlagEqualTo(1);
		List<TbResource> allList = resourceMapper.selectByExample(exampl);
//		Map<Long, TbResource> cache = new HashMap<Long, TbResource>();
//		for (TbResource resource : allList) {
//			// 判断是否为父菜单
//			if (resource.getResourceParentId()==0) {
//				dictionaryList.add(resource);
//				cache.put(resource.getRowId(), resource);
//			}
//		}
//		
//		for (TbResource resource : allList) {
//			if (resource.getResourceParentId()!= 0) {
//				Long pid = resource.getResourceParentId();
//				TbResource parent = cache.get(pid);
//				parent.getChildren().add(resource);
//			}
//		}
		return allList;
	}

	@Override
	public List<TbResource> findAllInList(List<Long> resourceIdList) {
		List<TbResource> resultList = new ArrayList<TbResource>();// 只存放父菜单 但是将children属性
		List<TbResource> allList = resourceMapper.findAllInList(resourceIdList);
		Map<Long, TbResource> cache = new HashMap<Long, TbResource>();
		for (TbResource resource : allList) {
			// 判断是否为父菜单
			if (resource.getResourceParentId()==0) {
				resultList.add(resource);
				cache.put(resource.getRowId(), resource);
			}
		}
		
		for (TbResource resource : allList) {
			if (resource.getResourceParentId()!= 0) {
				Long pid = resource.getResourceParentId();
				TbResource parent = cache.get(pid);
				parent.getChildren().add(resource);
			}
		}
		return resultList;
	}

}
