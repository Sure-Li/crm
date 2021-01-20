package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbClient;
import com.sureli.crm.bean.TbClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClientMapper {
    long countByExample(TbClientExample example);

    int deleteByExample(TbClientExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(TbClient record);

    int insertSelective(TbClient record);

    List<TbClient> selectByExampleWithBLOBs(TbClientExample example);

    List<TbClient> selectByExample(TbClientExample example);

    TbClient selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") TbClient record, @Param("example") TbClientExample example);

    int updateByExampleWithBLOBs(@Param("record") TbClient record, @Param("example") TbClientExample example);

    int updateByExample(@Param("record") TbClient record, @Param("example") TbClientExample example);

    int updateByPrimaryKeySelective(TbClient record);

    int updateByPrimaryKeyWithBLOBs(TbClient record);

    int updateByPrimaryKey(TbClient record);
}