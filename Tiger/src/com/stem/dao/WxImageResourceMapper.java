package com.stem.dao;

import com.stem.entity.WxImageResource;
import com.stem.entity.WxImageResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxImageResourceMapper {
    int countByExample(WxImageResourceExample example);

    int deleteByExample(WxImageResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxImageResource record);

    int insertSelective(WxImageResource record);

    List<WxImageResource> selectByExample(WxImageResourceExample example);

    WxImageResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxImageResource record, @Param("example") WxImageResourceExample example);

    int updateByExample(@Param("record") WxImageResource record, @Param("example") WxImageResourceExample example);

    int updateByPrimaryKeySelective(WxImageResource record);

    int updateByPrimaryKey(WxImageResource record);

	void batchInsertTemp(List<WxImageResource> wir);
	
	void clearTempTable();
	
	void clearTable();
	
	void synTable();
}