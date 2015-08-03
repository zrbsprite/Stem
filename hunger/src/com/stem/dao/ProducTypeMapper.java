package com.stem.dao;

import com.stem.entity.ProducType;
import com.stem.entity.ProducTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducTypeMapper {
    int countByExample(ProducTypeExample example);

    int deleteByExample(ProducTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProducType record);

    int insertSelective(ProducType record);

    List<ProducType> selectByExample(ProducTypeExample example);

    ProducType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProducType record, @Param("example") ProducTypeExample example);

    int updateByExample(@Param("record") ProducType record, @Param("example") ProducTypeExample example);

    int updateByPrimaryKeySelective(ProducType record);

    int updateByPrimaryKey(ProducType record);
}