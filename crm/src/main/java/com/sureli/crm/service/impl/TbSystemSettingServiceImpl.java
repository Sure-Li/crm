package com.sureli.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.crm.bean.TbSystemSetting;
import com.sureli.crm.bean.TbSystemSettingExample;
import com.sureli.crm.mapper.TbSystemSettingMapper;
import com.sureli.crm.service.TbSystemSettingService;
@Service
public class TbSystemSettingServiceImpl implements TbSystemSettingService {
	
	@Autowired
	TbSystemSettingMapper systemSettingMapper;
	
	@Override
	public TbSystemSetting findOne() {
		return systemSettingMapper.selectByPrimaryKey(1L);
	}

	@Override
	public Integer doUpdate(Long rowId, Integer systemSetting) {
		TbSystemSetting systemSettingGet = new TbSystemSetting();
		systemSettingGet.setRowId(rowId);
		
		systemSettingGet.setSettingValue(systemSetting.toString());
		TbSystemSettingExample example = new TbSystemSettingExample();
		com.sureli.crm.bean.TbSystemSettingExample.Criteria criteria = example.createCriteria();
		criteria.andRowIdEqualTo(rowId);
		return systemSettingMapper.updateByExampleSelective(systemSettingGet, example);//updateByExampleSelective(systemSettingGet, example);
	}

}
