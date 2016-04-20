package com.stem.dao;

import com.stem.entity.TigerUserOperation;
import com.stem.entity.TigerUserOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerUserOperationMapper {
    int countByExample(TigerUserOperationExample example);

    int deleteByExample(TigerUserOperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerUserOperation record);

    int insertSelective(TigerUserOperation record);

    List<TigerUserOperation> selectByExample(TigerUserOperationExample example);

    TigerUserOperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerUserOperation record, @Param("example") TigerUserOperationExample example);

    int updateByExample(@Param("record") TigerUserOperation record, @Param("example") TigerUserOperationExample example);

    int updateByPrimaryKeySelective(TigerUserOperation record);

    int updateByPrimaryKey(TigerUserOperation record);
}