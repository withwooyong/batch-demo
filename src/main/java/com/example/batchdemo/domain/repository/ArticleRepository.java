package com.example.batchdemo.domain.repository;

import com.example.batchdemo.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
