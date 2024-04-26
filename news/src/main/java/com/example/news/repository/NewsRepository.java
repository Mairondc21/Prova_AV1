package com.example.news.repository;

import com.example.news.model.NewsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<NewsEntity,String> {
}
