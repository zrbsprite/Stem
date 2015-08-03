package com.stem.dao;

import com.stem.entity.ProductLableRelation;
import com.stem.entity.ProductLableRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductLableRelationMapper {
    int countByExample(ProductLableRelationExample example);

    int deleteByExample(ProductLableRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductLableRelation record);

    int insertSelective(ProductLableRelation record);

    List<ProductLableRelation> selectByExample(ProductLableRelationExample example);

    ProductLableRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductLableRelation record, @Param("example") ProductLableRelationExample example);

    int updateByExample(@Param("record") ProductLableRelation record, @Param("example") ProductLableRelationExample example);

    int updateByPrimaryKeySelective(ProductLableRelation record);

    int updateByPrimaryKey(ProductLableRelation record);
}