package com.example.news.controller;

import com.example.news.model.NewsEntity;
import com.example.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/noticias")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping
    private String news(){
        return newsService.news();
    }
    @PostMapping
    public NewsEntity inserir (@RequestBody NewsEntity user) {return newsService.inserir(user);}





}
