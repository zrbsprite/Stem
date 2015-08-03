package com.stem.dao;

import com.stem.entity.MessageValidate;
import com.stem.entity.MessageValidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageValidateMapper {
    int countByExample(MessageValidateExample example);

    int deleteByExample(MessageValidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageValidate record);

    int insertSelective(MessageValidate record);

    List<MessageValidate> selectByExample(MessageValidateExample example);

    MessageValidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageValidate record, @Param("example") MessageValidateExample example);

    int updateByExample(@Param("record") MessageValidate record, @Param("example") MessageValidateExample example);

    int updateByPrimaryKeySelective(MessageValidate record);

    int updateByPrimaryKey(MessageValidate record);
}