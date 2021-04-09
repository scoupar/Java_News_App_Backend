package com.codeclan.example.SGNNNewsApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="article_title")
    private String articleTitle;
    @Column(columnDefinition="longtext", name="body")
    private String body;
    @Column(name="date")
    private LocalDate date;
    @JsonIgnoreProperties(value="articles")
    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;
    @Column(name="category")
    private Category category;
    @Column(name="image")
    private String image;


    public Article(String articleTitle, String body, LocalDate date, Journalist journalist, Category category, String image) {
        this.articleTitle = articleTitle;
        this.body = body;
        this.date = date;
        this.journalist = journalist;
        this.category = category;
        this.image = image;


    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
