package com.org.vote.dao;

import org.mybatis.spring.annotation.MapperScan;

import java.util.Map;

@MapperScan
public interface TestMapper {

    Map findTest(long id);
}
