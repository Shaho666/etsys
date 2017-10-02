package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbQuestionType;
import com.etsys.orm.pojo.TbQuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionTypeMapper {
    int countByExample(TbQuestionTypeExample example);

    int deleteByExample(TbQuestionTypeExample example);

    int deleteByPrimaryKey(Integer qtId);

    int insert(TbQuestionType record);

    int insertSelective(TbQuestionType record);

    List<TbQuestionType> selectByExample(TbQuestionTypeExample example);

    TbQuestionType selectByPrimaryKey(Integer qtId);

    int updateByExampleSelective(@Param("record") TbQuestionType record, @Param("example") TbQuestionTypeExample example);

    int updateByExample(@Param("record") TbQuestionType record, @Param("example") TbQuestionTypeExample example);

    int updateByPrimaryKeySelective(TbQuestionType record);

    int updateByPrimaryKey(TbQuestionType record);
}