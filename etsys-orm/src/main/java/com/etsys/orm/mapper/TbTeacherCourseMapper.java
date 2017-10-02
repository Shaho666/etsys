package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbTeacherCourse;
import com.etsys.orm.pojo.TbTeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTeacherCourseMapper {
    int countByExample(TbTeacherCourseExample example);

    int deleteByExample(TbTeacherCourseExample example);

    int insert(TbTeacherCourse record);

    int insertSelective(TbTeacherCourse record);

    List<TbTeacherCourse> selectByExample(TbTeacherCourseExample example);

    int updateByExampleSelective(@Param("record") TbTeacherCourse record, @Param("example") TbTeacherCourseExample example);

    int updateByExample(@Param("record") TbTeacherCourse record, @Param("example") TbTeacherCourseExample example);
}