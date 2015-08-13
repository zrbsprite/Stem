package com.stem.dao;

import com.stem.entity.TiggerOpt;
import com.stem.entity.TiggerOptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiggerOptMapper {
    int countByExample(TiggerOptExample example);

    int deleteByExample(TiggerOptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TiggerOpt record);

    int insertSelective(TiggerOpt record);

    List<TiggerOpt> selectByExample(TiggerOptExample example);

    TiggerOpt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TiggerOpt record, @Param("example") TiggerOptExample example);

    int updateByExample(@Param("record") TiggerOpt record, @Param("example") TiggerOptExample example);

    int updateByPrimaryKeySelective(TiggerOpt record);

    int updateByPrimaryKey(TiggerOpt record);
}