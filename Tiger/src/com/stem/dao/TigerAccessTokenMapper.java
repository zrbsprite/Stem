package com.stem.dao;

import com.stem.entity.TigerAccessToken;
import com.stem.entity.TigerAccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerAccessTokenMapper {
    int countByExample(TigerAccessTokenExample example);

    int deleteByExample(TigerAccessTokenExample example);

    int deleteByPrimaryKey(String id);

    int insert(TigerAccessToken record);

    int insertSelective(TigerAccessToken record);

    List<TigerAccessToken> selectByExample(TigerAccessTokenExample example);

    TigerAccessToken selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TigerAccessToken record, @Param("example") TigerAccessTokenExample example);

    int updateByExample(@Param("record") TigerAccessToken record, @Param("example") TigerAccessTokenExample example);

    int updateByPrimaryKeySelective(TigerAccessToken record);

    int updateByPrimaryKey(TigerAccessToken record);
}