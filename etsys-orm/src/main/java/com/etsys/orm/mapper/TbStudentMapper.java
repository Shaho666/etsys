package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentMapper {
    int countByExample(TbStudentExample example);

    int deleteByExample(TbStudentExample example);

    int deleteByPrimaryKey(String stuId);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    List<TbStudent> selectByExample(TbStudentExample example);

    TbStudent selectByPrimaryKey(String stuId);

    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);
}