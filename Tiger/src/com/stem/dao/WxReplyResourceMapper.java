package com.stem.dao;

import com.stem.entity.WxReplyResource;
import com.stem.entity.WxReplyResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxReplyResourceMapper {
    int countByExample(WxReplyResourceExample example);

    int deleteByExample(WxReplyResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxReplyResource record);

    int insertSelective(WxReplyResource record);

    List<WxReplyResource> selectByExample(WxReplyResourceExample example);

    WxReplyResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxReplyResource record, @Param("example") WxReplyResourceExample example);

    int updateByExample(@Param("record") WxReplyResource record, @Param("example") WxReplyResourceExample example);

    int updateByPrimaryKeySelective(WxReplyResource record);

    int updateByPrimaryKey(WxReplyResource record);
}