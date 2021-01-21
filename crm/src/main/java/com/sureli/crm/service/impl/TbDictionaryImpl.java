package com.sureli.crm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.crm.bean.TbDictionary;
import com.sureli.crm.bean.TbDictionaryExample;
import com.sureli.crm.mapper.TbDictionaryMapper;
import com.sureli.crm.service.TbDictionaryService;
@Service
public class TbDictionaryImpl implements TbDictionaryService {
	
	@Autowired
	TbDictionaryMapper dictionaryMapper;
	
	@Override
	public List<TbDictionary> finall() {
		List<TbDictionary> dictionaryList = new ArrayList<TbDictionary>();// 只存放父菜单 但是将children属性
		TbDictionaryExample exampl = new TbDictionaryExample();
		exampl.setOrderByClause("dictionary_order");
		com.sureli.crm.bean.TbDictionaryExample.Criteria criteria = exampl.createCriteria();
		criteria.andActiveFlagEqualTo(1);
		List<TbDictionary> allList = dictionaryMapper.selectByExample(exampl);
		Map<Long, TbDictionary> cache = new HashMap<Long, TbDictionary>();
		for (TbDictionary dictionary : allList) {
			// 判断是否为父菜单
			if (dictionary.getDictionaryParentId()==0) {
				dictionaryList.add(dictionary);
				cache.put(dictionary.getRowId(), dictionary);
			}
		}
		
		for (TbDictionary dictionary : allList) {
			if (dictionary.getDictionaryParentId()!= 0) {
				Long pid = dictionary.getDictionaryParentId();
				TbDictionary parent = cache.get(pid);
				parent.getChildren().add(dictionary);
			}
		}
		return dictionaryList;
	}

}
