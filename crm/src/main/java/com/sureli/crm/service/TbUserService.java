package com.sureli.crm.service;

import com.sureli.crm.bean.TbUser;
import com.sureli.crm.layuiresult.LayuiResult;
import com.sureli.crm.util.page.PageRequest;
import com.sureli.crm.util.page.PageResult;

public interface TbUserService {

	LayuiResult doUserLogin(String userCode, String userPassword, int pageNum);

	TbUser findUserByRowId(Long rowId);

	PageResult findPage(PageRequest pageQuery);

	Integer doAddUser(TbUser user, String createBy);

	Integer doEditUserById(TbUser user);

	Integer doDeleteUserById(Long rowId);

}
