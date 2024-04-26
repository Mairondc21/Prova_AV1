package com.example.news.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "news")
public class NewsEntity {
    @Id
    private String id;
    private String noticias;

    public NewsEntity(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }
}
