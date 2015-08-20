package com.stem.dao;

import com.stem.entity.Statement;
import com.stem.entity.StatementExample;
import com.stem.entity.StatementKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementMapper {
    int countByExample(StatementExample example);

    int deleteByExample(StatementExample example);

    int deleteByPrimaryKey(StatementKey key);

    int insert(Statement record);

    int insertSelective(Statement record);

    List<Statement> selectByExample(StatementExample example);

    Statement selectByPrimaryKey(StatementKey key);

    int updateByExampleSelective(@Param("record") Statement record, @Param("example") StatementExample example);

    int updateByExample(@Param("record") Statement record, @Param("example") StatementExample example);

    int updateByPrimaryKeySelective(Statement record);

    int updateByPrimaryKey(Statement record);
}