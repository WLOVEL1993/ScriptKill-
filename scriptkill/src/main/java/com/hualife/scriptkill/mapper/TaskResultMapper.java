package com.hualife.scriptkill.mapper;

import com.hualife.scriptkill.model.TaskResult;

public interface TaskResultMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TaskResult record);

    int insertSelective(TaskResult record);

    TaskResult selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TaskResult record);

    int updateByPrimaryKey(TaskResult record);
}