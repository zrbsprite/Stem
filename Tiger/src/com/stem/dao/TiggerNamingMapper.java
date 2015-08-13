package com.stem.dao;

import com.stem.entity.TiggerNaming;
import com.stem.entity.TiggerNamingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiggerNamingMapper {
    int countByExample(TiggerNamingExample example);

    int deleteByExample(TiggerNamingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TiggerNaming record);

    int insertSelective(TiggerNaming record);

    List<TiggerNaming> selectByExample(TiggerNamingExample example);

    TiggerNaming selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TiggerNaming record, @Param("example") TiggerNamingExample example);

    int updateByExample(@Param("record") TiggerNaming record, @Param("example") TiggerNamingExample example);

    int updateByPrimaryKeySelective(TiggerNaming record);

    int updateByPrimaryKey(TiggerNaming record);
}