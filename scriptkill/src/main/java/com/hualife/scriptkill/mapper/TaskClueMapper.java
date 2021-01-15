package com.hualife.scriptkill.mapper;

import com.hualife.scriptkill.model.TaskClue;

public interface TaskClueMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskClue record);

    int insertSelective(TaskClue record);

    TaskClue selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(TaskClue record);

    int updateByPrimaryKey(TaskClue record);
}