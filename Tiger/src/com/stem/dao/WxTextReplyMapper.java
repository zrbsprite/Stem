package com.stem.dao;

import com.stem.entity.WxTextReply;
import com.stem.entity.WxTextReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxTextReplyMapper {
    int countByExample(WxTextReplyExample example);

    int deleteByExample(WxTextReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxTextReply record);

    int insertSelective(WxTextReply record);

    List<WxTextReply> selectByExample(WxTextReplyExample example);

    WxTextReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxTextReply record, @Param("example") WxTextReplyExample example);

    int updateByExample(@Param("record") WxTextReply record, @Param("example") WxTextReplyExample example);

    int updateByPrimaryKeySelective(WxTextReply record);

    int updateByPrimaryKey(WxTextReply record);
}