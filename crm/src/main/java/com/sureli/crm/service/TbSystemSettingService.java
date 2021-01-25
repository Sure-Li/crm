package com.sureli.crm.service;

import com.sureli.crm.bean.TbSystemSetting;

public interface TbSystemSettingService {

	TbSystemSetting findOne();

	Integer doUpdate(Long rowId, Integer systemSetting);

}
