package com.stem.dao;

import com.stem.entity.TigerOpt;
import com.stem.entity.TigerOptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerOptMapper {
    int countByExample(TigerOptExample example);

    int deleteByExample(TigerOptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerOpt record);

    int insertSelective(TigerOpt record);

    List<TigerOpt> selectByExample(TigerOptExample example);

    TigerOpt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerOpt record, @Param("example") TigerOptExample example);

    int updateByExample(@Param("record") TigerOpt record, @Param("example") TigerOptExample example);

    int updateByPrimaryKeySelective(TigerOpt record);

    int updateByPrimaryKey(TigerOpt record);
}