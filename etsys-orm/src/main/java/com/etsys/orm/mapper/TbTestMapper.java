package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbTest;
import com.etsys.orm.pojo.TbTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTestMapper {
    int countByExample(TbTestExample example);

    int deleteByExample(TbTestExample example);

    int deleteByPrimaryKey(String testId);

    int insert(TbTest record);

    int insertSelective(TbTest record);

    List<TbTest> selectByExample(TbTestExample example);

    TbTest selectByPrimaryKey(String testId);

    int updateByExampleSelective(@Param("record") TbTest record, @Param("example") TbTestExample example);

    int updateByExample(@Param("record") TbTest record, @Param("example") TbTestExample example);

    int updateByPrimaryKeySelective(TbTest record);

    int updateByPrimaryKey(TbTest record);
}