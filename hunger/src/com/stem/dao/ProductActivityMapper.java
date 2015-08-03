package com.stem.dao;

import com.stem.entity.ProductActivity;
import com.stem.entity.ProductActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductActivityMapper {
    int countByExample(ProductActivityExample example);

    int deleteByExample(ProductActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductActivity record);

    int insertSelective(ProductActivity record);

    List<ProductActivity> selectByExampleWithBLOBs(ProductActivityExample example);

    List<ProductActivity> selectByExample(ProductActivityExample example);

    ProductActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductActivity record, @Param("example") ProductActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductActivity record, @Param("example") ProductActivityExample example);

    int updateByExample(@Param("record") ProductActivity record, @Param("example") ProductActivityExample example);

    int updateByPrimaryKeySelective(ProductActivity record);

    int updateByPrimaryKeyWithBLOBs(ProductActivity record);

    int updateByPrimaryKey(ProductActivity record);
}