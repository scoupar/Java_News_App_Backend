package com.codeclan.example.SGNNNewsApp.controller;


import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;


}
