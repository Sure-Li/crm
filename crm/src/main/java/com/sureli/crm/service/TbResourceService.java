package com.sureli.crm.service;

import java.util.List;

import com.sureli.crm.bean.TbResource;

public interface TbResourceService {

	List<TbResource> findAll();

	List<TbResource> findAllInList(List<Long> resourceIdList);

}
