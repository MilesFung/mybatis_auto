package com.fj.mapper;

import com.fj.domain.Userrec;

public interface UserrecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userrec record);

    int insertSelective(Userrec record);

    Userrec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userrec record);

    int updateByPrimaryKey(Userrec record);
}