package com.stem.dao;

import com.stem.entity.UserApprove;
import com.stem.entity.UserApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApproveMapper {
    int countByExample(UserApproveExample example);

    int deleteByExample(UserApproveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserApprove record);

    int insertSelective(UserApprove record);

    List<UserApprove> selectByExample(UserApproveExample example);

    UserApprove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserApprove record, @Param("example") UserApproveExample example);

    int updateByExample(@Param("record") UserApprove record, @Param("example") UserApproveExample example);

    int updateByPrimaryKeySelective(UserApprove record);

    int updateByPrimaryKey(UserApprove record);
}