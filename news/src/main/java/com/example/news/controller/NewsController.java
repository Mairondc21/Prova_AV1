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
    @PostMapping
    public NewsEntity inserir (@RequestBody NewsEntity user) {return newsService.inserir(user);}

    @GetMapping("/noticiasereleases")
    public String consultarNoticiasERealese(){
        return newsService.consultarNoticiasERealeses();
    }

    @GetMapping("/noticias")
    public String consultarNoticias(){
        return newsService.consultarNoticias();
    }
    @GetMapping("releases")
    public String cconsultarReleases(){
        return newsService.consultarReleases();
    }


}
