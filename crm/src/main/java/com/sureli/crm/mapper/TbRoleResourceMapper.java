package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbRoleResource;
import com.sureli.crm.bean.TbRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TbRoleResourceMapper {
    long countByExample(TbRoleResourceExample example);

    int deleteByExample(TbRoleResourceExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(TbRoleResource record);

    int insertSelective(TbRoleResource record);

    List<TbRoleResource> selectByExample(TbRoleResourceExample example);

    TbRoleResource selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") TbRoleResource record, @Param("example") TbRoleResourceExample example);

    int updateByExample(@Param("record") TbRoleResource record, @Param("example") TbRoleResourceExample example);

    int updateByPrimaryKeySelective(TbRoleResource record);

    int updateByPrimaryKey(TbRoleResource record);
}