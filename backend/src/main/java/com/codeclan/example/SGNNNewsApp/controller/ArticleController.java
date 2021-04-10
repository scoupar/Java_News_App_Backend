package com.codeclan.example.SGNNNewsApp.controller;


import com.codeclan.example.SGNNNewsApp.model.Article;
import com.codeclan.example.SGNNNewsApp.model.Category;
import com.codeclan.example.SGNNNewsApp.model.Journalist;
import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;


    @GetMapping(value = "/articles")
    public ResponseEntity<List<Article>> getAllArticles(){
        return new ResponseEntity<>(articleRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/articles/journalist/name")
    public ResponseEntity<List<Article>> findArticleByJournalist(
            @RequestParam(name = "name") String name
    ){
        return new ResponseEntity<List<Article>>(articleRepository.findArticleByJournalistName(name), HttpStatus.OK);
    }

    @GetMapping(value = "/articles/category")
    public ResponseEntity <List<Article>> findArticleByCategory(
            @RequestParam(name = "category") Category category

    ){
        return new ResponseEntity<List<Article>>(articleRepository.findArticleByCategory(category), HttpStatus.OK);

    }

    @GetMapping(value = "/articles/date")
    public ResponseEntity <List<Article>> findArticlesByDate(
            @RequestParam(name = "date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ){
        return new ResponseEntity<List<Article>>(articleRepository.findArticlesByDate(date), HttpStatus.OK);
    }

    @GetMapping(value = "/articles/{id}")
    public ResponseEntity getArticle(@PathVariable Long id){
        return new ResponseEntity<>(articleRepository.findById(id),HttpStatus.OK);
    }


    @PostMapping(value = "/articles")
    public ResponseEntity<Article> postArticle(@RequestBody Article article){
        articleRepository.save(article);
        return new ResponseEntity<>(article,HttpStatus.CREATED);
    }

    @PatchMapping(value = "/articles/{id}")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        articleRepository.save(article);
        return new ResponseEntity<>(article,HttpStatus.OK);
    }

    @DeleteMapping(value = "/articles/{id}")
    public ResponseEntity<Article> deleteArticle(@PathVariable Long id) {
        Article found = articleRepository.getOne(id);
        articleRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
