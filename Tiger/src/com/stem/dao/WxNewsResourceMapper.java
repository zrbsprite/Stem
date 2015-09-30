package com.stem.dao;

import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxNewsResourceMapper {
    int countByExample(WxNewsResourceExample example);

    int deleteByExample(WxNewsResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxNewsResource record);

    int insertSelective(WxNewsResource record);

    List<WxNewsResource> selectByExample(WxNewsResourceExample example);

    WxNewsResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxNewsResource record, @Param("example") WxNewsResourceExample example);

    int updateByExample(@Param("record") WxNewsResource record, @Param("example") WxNewsResourceExample example);

    int updateByPrimaryKeySelective(WxNewsResource record);

    int updateByPrimaryKey(WxNewsResource record);
}