package com.hualife.scriptkill.mapper;

import com.hualife.scriptkill.model.TaskUserRole;

public interface TaskUserRoleMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskUserRole record);

    int insertSelective(TaskUserRole record);

    TaskUserRole selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(TaskUserRole record);

    int updateByPrimaryKey(TaskUserRole record);
}