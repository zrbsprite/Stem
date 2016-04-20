package com.stem.dao;

import com.stem.entity.TigerUriInfo;
import com.stem.entity.TigerUriInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerUriInfoMapper {
    int countByExample(TigerUriInfoExample example);

    int deleteByExample(TigerUriInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerUriInfo record);

    int insertSelective(TigerUriInfo record);

    List<TigerUriInfo> selectByExample(TigerUriInfoExample example);

    TigerUriInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerUriInfo record, @Param("example") TigerUriInfoExample example);

    int updateByExample(@Param("record") TigerUriInfo record, @Param("example") TigerUriInfoExample example);

    int updateByPrimaryKeySelective(TigerUriInfo record);

    int updateByPrimaryKey(TigerUriInfo record);
}