package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbResource;
import com.sureli.crm.bean.TbResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TbResourceMapper {
    long countByExample(TbResourceExample example);

    int deleteByExample(TbResourceExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(TbResource record);

    int insertSelective(TbResource record);

    List<TbResource> selectByExample(TbResourceExample example);

    TbResource selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") TbResource record, @Param("example") TbResourceExample example);

    int updateByExample(@Param("record") TbResource record, @Param("example") TbResourceExample example);

    int updateByPrimaryKeySelective(TbResource record);

    int updateByPrimaryKey(TbResource record);
}