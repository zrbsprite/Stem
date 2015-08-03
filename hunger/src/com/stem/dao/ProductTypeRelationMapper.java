package com.stem.dao;

import com.stem.entity.ProductTypeRelation;
import com.stem.entity.ProductTypeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeRelationMapper {
    int countByExample(ProductTypeRelationExample example);

    int deleteByExample(ProductTypeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductTypeRelation record);

    int insertSelective(ProductTypeRelation record);

    List<ProductTypeRelation> selectByExample(ProductTypeRelationExample example);

    ProductTypeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductTypeRelation record, @Param("example") ProductTypeRelationExample example);

    int updateByExample(@Param("record") ProductTypeRelation record, @Param("example") ProductTypeRelationExample example);

    int updateByPrimaryKeySelective(ProductTypeRelation record);

    int updateByPrimaryKey(ProductTypeRelation record);
}