package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbDictionary;
import com.sureli.crm.bean.TbDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository

public interface TbDictionaryMapper {
	long countByExample(TbDictionaryExample example);

	int deleteByExample(TbDictionaryExample example);

	int deleteByPrimaryKey(Long rowId);

	int insert(TbDictionary record);

	int insertSelective(TbDictionary record);

	List<TbDictionary> selectByExampleWithBLOBs(TbDictionaryExample example);

	List<TbDictionary> selectByExample(TbDictionaryExample example);

	TbDictionary selectByPrimaryKey(Long rowId);

	int updateByExampleSelective(@Param("record") TbDictionary record, @Param("example") TbDictionaryExample example);

	int updateByExampleWithBLOBs(@Param("record") TbDictionary record, @Param("example") TbDictionaryExample example);

	int updateByExample(@Param("record") TbDictionary record, @Param("example") TbDictionaryExample example);

	int updateByPrimaryKeySelective(TbDictionary record);

	int updateByPrimaryKeyWithBLOBs(TbDictionary record);

	int updateByPrimaryKey(TbDictionary record);
}