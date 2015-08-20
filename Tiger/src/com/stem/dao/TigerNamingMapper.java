package com.stem.dao;

import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerNamingMapper {
    int countByExample(TigerNamingExample example);

    int deleteByExample(TigerNamingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerNaming record);

    int insertSelective(TigerNaming record);

    List<TigerNaming> selectByExample(TigerNamingExample example);

    TigerNaming selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerNaming record, @Param("example") TigerNamingExample example);

    int updateByExample(@Param("record") TigerNaming record, @Param("example") TigerNamingExample example);

    int updateByPrimaryKeySelective(TigerNaming record);

    int updateByPrimaryKey(TigerNaming record);
}