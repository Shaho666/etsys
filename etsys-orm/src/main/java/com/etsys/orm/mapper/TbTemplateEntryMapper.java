package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbTemplateEntry;
import com.etsys.orm.pojo.TbTemplateEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTemplateEntryMapper {
    int countByExample(TbTemplateEntryExample example);

    int deleteByExample(TbTemplateEntryExample example);

    int deleteByPrimaryKey(Integer temEntryId);

    int insert(TbTemplateEntry record);

    int insertSelective(TbTemplateEntry record);

    List<TbTemplateEntry> selectByExample(TbTemplateEntryExample example);

    TbTemplateEntry selectByPrimaryKey(Integer temEntryId);

    int updateByExampleSelective(@Param("record") TbTemplateEntry record, @Param("example") TbTemplateEntryExample example);

    int updateByExample(@Param("record") TbTemplateEntry record, @Param("example") TbTemplateEntryExample example);

    int updateByPrimaryKeySelective(TbTemplateEntry record);

    int updateByPrimaryKey(TbTemplateEntry record);
}