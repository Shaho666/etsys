package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbQuestionBank;
import com.etsys.orm.pojo.TbQuestionBankExample;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionBankMapper {
    int countByExample(TbQuestionBankExample example);

    int deleteByExample(TbQuestionBankExample example);

    int deleteByPrimaryKey(String queId);

    int insert(TbQuestionBankWithBLOBs record);

    int insertSelective(TbQuestionBankWithBLOBs record);

    List<TbQuestionBankWithBLOBs> selectByExampleWithBLOBs(TbQuestionBankExample example);

    List<TbQuestionBank> selectByExample(TbQuestionBankExample example);

    TbQuestionBankWithBLOBs selectByPrimaryKey(String queId);

    int updateByExampleSelective(@Param("record") TbQuestionBankWithBLOBs record, @Param("example") TbQuestionBankExample example);

    int updateByExampleWithBLOBs(@Param("record") TbQuestionBankWithBLOBs record, @Param("example") TbQuestionBankExample example);

    int updateByExample(@Param("record") TbQuestionBank record, @Param("example") TbQuestionBankExample example);

    int updateByPrimaryKeySelective(TbQuestionBankWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbQuestionBankWithBLOBs record);

    int updateByPrimaryKey(TbQuestionBank record);
}