package com.stem.dao;

import com.stem.entity.TigerPay;
import com.stem.entity.TigerPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TigerPayMapper {
    int countByExample(TigerPayExample example);

    int deleteByExample(TigerPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TigerPay record);

    int insertSelective(TigerPay record);

    List<TigerPay> selectByExample(TigerPayExample example);

    TigerPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TigerPay record, @Param("example") TigerPayExample example);

    int updateByExample(@Param("record") TigerPay record, @Param("example") TigerPayExample example);

    int updateByPrimaryKeySelective(TigerPay record);

    int updateByPrimaryKey(TigerPay record);
}