package com.etsys.orm.mapper;

import com.etsys.orm.pojo.TbPaperState;
import com.etsys.orm.pojo.TbPaperStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPaperStateMapper {
    int countByExample(TbPaperStateExample example);

    int deleteByExample(TbPaperStateExample example);

    int deleteByPrimaryKey(Integer psId);

    int insert(TbPaperState record);

    int insertSelective(TbPaperState record);

    List<TbPaperState> selectByExample(TbPaperStateExample example);

    TbPaperState selectByPrimaryKey(Integer psId);

    int updateByExampleSelective(@Param("record") TbPaperState record, @Param("example") TbPaperStateExample example);

    int updateByExample(@Param("record") TbPaperState record, @Param("example") TbPaperStateExample example);

    int updateByPrimaryKeySelective(TbPaperState record);

    int updateByPrimaryKey(TbPaperState record);
}