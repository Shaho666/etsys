package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTemplateMapper {
    int countByExample(TbTemplateExample example);

    int deleteByExample(TbTemplateExample example);

    int deleteByPrimaryKey(String temId);

    int insert(TbTemplate record);

    int insertSelective(TbTemplate record);

    List<TbTemplate> selectByExample(TbTemplateExample example);

    TbTemplate selectByPrimaryKey(String temId);

    int updateByExampleSelective(@Param("record") TbTemplate record, @Param("example") TbTemplateExample example);

    int updateByExample(@Param("record") TbTemplate record, @Param("example") TbTemplateExample example);

    int updateByPrimaryKeySelective(TbTemplate record);

    int updateByPrimaryKey(TbTemplate record);
}