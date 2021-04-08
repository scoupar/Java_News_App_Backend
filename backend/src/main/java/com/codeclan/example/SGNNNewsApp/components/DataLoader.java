package com.codeclan.example.SGNNNewsApp.components;


import com.codeclan.example.SGNNNewsApp.model.Article;
import com.codeclan.example.SGNNNewsApp.model.Category;
import com.codeclan.example.SGNNNewsApp.model.Journalist;
import com.codeclan.example.SGNNNewsApp.repository.ArticleRepository;
import com.codeclan.example.SGNNNewsApp.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {



    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;


    public DataLoader() {

    }

    public void run (ApplicationArguments args) {
        Journalist gregor = new Journalist("Gregor Simpson", "Crime reporter");
        journalistRepository.save(gregor);
        Journalist tina = new Journalist("Tina Houston", "Chief feature writer");
        journalistRepository.save(tina);
        Journalist scott = new Journalist("Scott Coupar", "Chief sports writer");
        journalistRepository.save(scott);
        Journalist helen = new Journalist("Helen Aguda", "Politics editor");
        journalistRepository.save(helen);
        Article article1 = new Article("Article1", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 12), gregor, Category.News);
        articleRepository.save(article1);
        Article article2 = new Article("Article2", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 10), tina, Category.Entertainment);
        articleRepository.save(article2);
        Article article3 = new Article("Article3", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 12), scott, Category.Sports);
        articleRepository.save(article3);
        Article article4 = new Article("Article4", "Lorem ipsum dolor sit amet", LocalDate.of(2021, 3, 5), helen, Category.Politics);
        articleRepository.save(article1);
        gregor.addArticle(article1);
        journalistRepository.save(gregor);
        helen.addArticle(article4);
        journalistRepository.save(helen);
        tina.addArticle(article2);
        journalistRepository.save(tina);
        scott.addArticle(article3);
        journalistRepository.save(scott);

    }
}
