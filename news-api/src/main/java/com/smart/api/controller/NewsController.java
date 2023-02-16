package com.smart.api.controller;

import com.smart.api.mapper.NewsMapper;
import com.smart.api.model.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NewsController {
    @Resource
    private NewsMapper newsMapper;

    @RequestMapping("/news/get")
    public News get() {
        return newsMapper.get(1);
    }
}
