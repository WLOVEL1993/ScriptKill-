package com.hualife.scriptkill.mapper;

import com.hualife.scriptkill.model.Script;

public interface ScriptMapper {
    int deleteByPrimaryKey(Integer scriptId);

    int insert(Script record);

    int insertSelective(Script record);

    Script selectByPrimaryKey(Integer scriptId);

    int updateByPrimaryKeySelective(Script record);

    int updateByPrimaryKey(Script record);
}