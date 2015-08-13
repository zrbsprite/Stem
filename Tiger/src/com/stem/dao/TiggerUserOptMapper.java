package com.stem.dao;

import com.stem.entity.TiggerUserOpt;
import com.stem.entity.TiggerUserOptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiggerUserOptMapper {
    int countByExample(TiggerUserOptExample example);

    int deleteByExample(TiggerUserOptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TiggerUserOpt record);

    int insertSelective(TiggerUserOpt record);

    List<TiggerUserOpt> selectByExample(TiggerUserOptExample example);

    TiggerUserOpt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TiggerUserOpt record, @Param("example") TiggerUserOptExample example);

    int updateByExample(@Param("record") TiggerUserOpt record, @Param("example") TiggerUserOptExample example);

    int updateByPrimaryKeySelective(TiggerUserOpt record);

    int updateByPrimaryKey(TiggerUserOpt record);
}