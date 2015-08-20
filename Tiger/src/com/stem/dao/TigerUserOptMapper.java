package com.stem.dao;

import com.stem.entity.TigerUserOpt;
import com.stem.entity.TigerUserOptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerUserOptMapper {
    int countByExample(TigerUserOptExample example);

    int deleteByExample(TigerUserOptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerUserOpt record);

    int insertSelective(TigerUserOpt record);

    List<TigerUserOpt> selectByExample(TigerUserOptExample example);

    TigerUserOpt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerUserOpt record, @Param("example") TigerUserOptExample example);

    int updateByExample(@Param("record") TigerUserOpt record, @Param("example") TigerUserOptExample example);

    int updateByPrimaryKeySelective(TigerUserOpt record);

    int updateByPrimaryKey(TigerUserOpt record);
}