package com.codeclan.example.SGNNNewsApp.repository;

import com.codeclan.example.SGNNNewsApp.model.Article;
import com.codeclan.example.SGNNNewsApp.model.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}

