package com.penzias.core.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BasicMapper<E, M> {

	int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Object id);

    int insert(M record);

    int insertSelective(M record);

    List<M> selectByExample(E example);

    M selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") M record, @Param("example") E example);

    int updateByExample(@Param("record") M record, @Param("example") E example);

    int updateByPrimaryKeySelective(M record);

    int updateByPrimaryKey(M record);
}
