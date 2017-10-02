package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbScore;
import com.etsys.orm.pojo.TbScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbScoreMapper {
    int countByExample(TbScoreExample example);

    int deleteByExample(TbScoreExample example);

    int deleteByPrimaryKey(String scoId);

    int insert(TbScore record);

    int insertSelective(TbScore record);

    List<TbScore> selectByExampleWithBLOBs(TbScoreExample example);

    List<TbScore> selectByExample(TbScoreExample example);

    TbScore selectByPrimaryKey(String scoId);

    int updateByExampleSelective(@Param("record") TbScore record, @Param("example") TbScoreExample example);

    int updateByExampleWithBLOBs(@Param("record") TbScore record, @Param("example") TbScoreExample example);

    int updateByExample(@Param("record") TbScore record, @Param("example") TbScoreExample example);

    int updateByPrimaryKeySelective(TbScore record);

    int updateByPrimaryKeyWithBLOBs(TbScore record);

    int updateByPrimaryKey(TbScore record);
}