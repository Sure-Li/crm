package com.sureli.crm.service;

import java.util.List;

import com.sureli.crm.bean.TbResource;

public interface TbRoleResourceService {

	List<Long> findAllByRoleId(Long roleId);

}
