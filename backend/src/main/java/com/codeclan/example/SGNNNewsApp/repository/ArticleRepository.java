package com.codeclan.example.SGNNNewsApp.repository;

import com.codeclan.example.SGNNNewsApp.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
