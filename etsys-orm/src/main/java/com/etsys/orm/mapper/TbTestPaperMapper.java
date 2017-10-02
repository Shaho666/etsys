package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbTestPaper;
import com.etsys.orm.pojo.TbTestPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTestPaperMapper {
    int countByExample(TbTestPaperExample example);

    int deleteByExample(TbTestPaperExample example);

    int deleteByPrimaryKey(String tpId);

    int insert(TbTestPaper record);

    int insertSelective(TbTestPaper record);

    List<TbTestPaper> selectByExampleWithBLOBs(TbTestPaperExample example);

    List<TbTestPaper> selectByExample(TbTestPaperExample example);

    TbTestPaper selectByPrimaryKey(String tpId);

    int updateByExampleSelective(@Param("record") TbTestPaper record, @Param("example") TbTestPaperExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTestPaper record, @Param("example") TbTestPaperExample example);

    int updateByExample(@Param("record") TbTestPaper record, @Param("example") TbTestPaperExample example);

    int updateByPrimaryKeySelective(TbTestPaper record);

    int updateByPrimaryKeyWithBLOBs(TbTestPaper record);

    int updateByPrimaryKey(TbTestPaper record);
}