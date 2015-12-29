package com.stem.dao;

import com.stem.entity.WxNewsItem;
import com.stem.entity.WxNewsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxNewsItemMapper {
    int countByExample(WxNewsItemExample example);

    int deleteByExample(WxNewsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxNewsItem record);

    int insertSelective(WxNewsItem record);

    List<WxNewsItem> selectByExampleWithBLOBs(WxNewsItemExample example);

    List<WxNewsItem> selectByExample(WxNewsItemExample example);

    WxNewsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxNewsItem record, @Param("example") WxNewsItemExample example);

    int updateByExampleWithBLOBs(@Param("record") WxNewsItem record, @Param("example") WxNewsItemExample example);

    int updateByExample(@Param("record") WxNewsItem record, @Param("example") WxNewsItemExample example);

    int updateByPrimaryKeySelective(WxNewsItem record);

    int updateByPrimaryKeyWithBLOBs(WxNewsItem record);

    int updateByPrimaryKey(WxNewsItem record);
}