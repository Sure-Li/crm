package com.sureli.crm.mapper;

import com.sureli.crm.bean.TbSystemSetting;
import com.sureli.crm.bean.TbSystemSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TbSystemSettingMapper {
    long countByExample(TbSystemSettingExample example);

    int deleteByExample(TbSystemSettingExample example);

    int deleteByPrimaryKey(Long rowId);

    int insert(TbSystemSetting record);

    int insertSelective(TbSystemSetting record);

    List<TbSystemSetting> selectByExample(TbSystemSettingExample example);

    TbSystemSetting selectByPrimaryKey(Long rowId);

    int updateByExampleSelective(@Param("record") TbSystemSetting record, @Param("example") TbSystemSettingExample example);

    int updateByExample(@Param("record") TbSystemSetting record, @Param("example") TbSystemSettingExample example);

    int updateByPrimaryKeySelective(TbSystemSetting record);

    int updateByPrimaryKey(TbSystemSetting record);
}