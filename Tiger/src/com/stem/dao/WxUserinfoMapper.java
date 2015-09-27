package com.stem.dao;

import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserinfoMapper {
    int countByExample(WxUserinfoExample example);

    int deleteByExample(WxUserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxUserinfo record);

    int insertSelective(WxUserinfo record);

    List<WxUserinfo> selectByExample(WxUserinfoExample example);

    WxUserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxUserinfo record, @Param("example") WxUserinfoExample example);

    int updateByExample(@Param("record") WxUserinfo record, @Param("example") WxUserinfoExample example);

    int updateByPrimaryKeySelective(WxUserinfo record);

    int updateByPrimaryKey(WxUserinfo record);
}