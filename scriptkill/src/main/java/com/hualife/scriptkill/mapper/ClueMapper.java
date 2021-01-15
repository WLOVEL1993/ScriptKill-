package com.hualife.scriptkill.mapper;

import com.hualife.scriptkill.model.Clue;

public interface ClueMapper {
    int deleteByPrimaryKey(Integer clueId);

    int insert(Clue record);

    int insertSelective(Clue record);

    Clue selectByPrimaryKey(Integer clueId);

    int updateByPrimaryKeySelective(Clue record);

    int updateByPrimaryKey(Clue record);
}