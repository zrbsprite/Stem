package com.stem.dao;

import com.stem.entity.TigerUserinfo;
import com.stem.entity.TigerUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerUserinfoMapper {
    int countByExample(TigerUserinfoExample example);

    int deleteByExample(TigerUserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerUserinfo record);

    int insertSelective(TigerUserinfo record);

    List<TigerUserinfo> selectByExample(TigerUserinfoExample example);

    TigerUserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerUserinfo record, @Param("example") TigerUserinfoExample example);

    int updateByExample(@Param("record") TigerUserinfo record, @Param("example") TigerUserinfoExample example);

    int updateByPrimaryKeySelective(TigerUserinfo record);

    int updateByPrimaryKey(TigerUserinfo record);
}