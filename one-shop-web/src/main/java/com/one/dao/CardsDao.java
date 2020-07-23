package com.one.dao;

import com.one.pojo.entity.Cards;

public interface CardsDao {
    int deleteByPrimaryKey(Long cardId);

    int insert(Cards record);

    int insertSelective(Cards record);

    Cards selectByPrimaryKey(Long cardId);

    int updateByPrimaryKeySelective(Cards record);

    int updateByPrimaryKey(Cards record);
}