package com.org.vote.controller;

import com.org.vote.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping ( "/front" )
public class IndexController {

    private final TestMapper testMapper;

    @Autowired
    public IndexController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @RequestMapping("/index")
    public String index(){
        Map map = testMapper.findTest(1);
        return "index";
    }
}
