package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbResourceAction;
import com.sureli.crm.bean.TbResourceActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbResourceActionMapper {
    long countByExample(TbResourceActionExample example);

    int deleteByExample(TbResourceActionExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(TbResourceAction record);

    int insertSelective(TbResourceAction record);

    List<TbResourceAction> selectByExample(TbResourceActionExample example);

    TbResourceAction selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") TbResourceAction record, @Param("example") TbResourceActionExample example);

    int updateByExample(@Param("record") TbResourceAction record, @Param("example") TbResourceActionExample example);

    int updateByPrimaryKeySelective(TbResourceAction record);

    int updateByPrimaryKey(TbResourceAction record);
}