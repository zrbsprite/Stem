package com.stem.dao;

import com.stem.entity.WxImageReply;
import com.stem.entity.WxImageReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxImageReplyMapper{
    int countByExample(WxImageReplyExample example);

    int deleteByExample(WxImageReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxImageReply record);

    int insertSelective(WxImageReply record);

    List<WxImageReply> selectByExample(WxImageReplyExample example);

    WxImageReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxImageReply record, @Param("example") WxImageReplyExample example);

    int updateByExample(@Param("record") WxImageReply record, @Param("example") WxImageReplyExample example);

    int updateByPrimaryKeySelective(WxImageReply record);

    int updateByPrimaryKey(WxImageReply record);
}