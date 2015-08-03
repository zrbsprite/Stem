package com.stem.dao;

import com.stem.entity.SixDegreesSpace;
import com.stem.entity.SixDegreesSpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SixDegreesSpaceMapper {
    int countByExample(SixDegreesSpaceExample example);

    int deleteByExample(SixDegreesSpaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SixDegreesSpace record);

    int insertSelective(SixDegreesSpace record);

    List<SixDegreesSpace> selectByExample(SixDegreesSpaceExample example);

    SixDegreesSpace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SixDegreesSpace record, @Param("example") SixDegreesSpaceExample example);

    int updateByExample(@Param("record") SixDegreesSpace record, @Param("example") SixDegreesSpaceExample example);

    int updateByPrimaryKeySelective(SixDegreesSpace record);

    int updateByPrimaryKey(SixDegreesSpace record);
}