package com.example.news.service;

import com.example.news.model.NewsEntity;
import com.example.news.repository.NewsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public String news(String apiUrl){

        String dadosNews = "";
        String apiURL = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            System.out.println("Código de status: " + responseEntity.getStatusCode() );
            dadosNews = responseEntity.getBody();
            System.out.println(dadosNews);
        }else{
            dadosNews = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dadosNews;
    }

    public NewsEntity inserir(NewsEntity user) {
        return newsRepository.save(user);
    }

    public String consultarNoticiasERealese(){
        return news("https://servicodados.ibge.gov.br/api/v3/noticias");
    }
}
