package com.stem.dao;

import com.stem.entity.WxNewsInfo;
import com.stem.entity.WxNewsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxNewsInfoMapper {
    int countByExample(WxNewsInfoExample example);

    int deleteByExample(WxNewsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxNewsInfo record);

    int insertSelective(WxNewsInfo record);

    List<WxNewsInfo> selectByExample(WxNewsInfoExample example);

    WxNewsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxNewsInfo record, @Param("example") WxNewsInfoExample example);

    int updateByExample(@Param("record") WxNewsInfo record, @Param("example") WxNewsInfoExample example);

    int updateByPrimaryKeySelective(WxNewsInfo record);

    int updateByPrimaryKey(WxNewsInfo record);
}