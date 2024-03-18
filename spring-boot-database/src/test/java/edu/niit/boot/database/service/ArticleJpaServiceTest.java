package edu.niit.boot.database.service;

import edu.niit.boot.database.entity.Article;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Service
class ArticleJpaServiceTest {
    @Resource
    private ArticleJpaService articleJpaService;
    @Test
    void saveArticle() {
        Article article = Article.builder()
                .author("lxs")
                .title("Spring Boot")
                .content("Spring Boot Content")
                .build();
         articleJpaService.saveArticle(article);
    }

    @Test
    void updateArticle() {
        Article article = Article.builder()
                .id(1)
                .author("lxs")
                .title("Spring Boot")
                .content("Spring Boot Content")
                .build();
        articleJpaService.updateArticle(article);
    }

    @Test
    void getArticleById() {
        Article article = articleJpaService.getArticleById(1);
        System.out.println(article);
    }

    @Test
    void findAll() {
        List<Article> all = articleJpaService.findAll();
        all.forEach(System.out::println);

    }

    @Test
    void deleteArticle() {
        articleJpaService.deleteArticle(1);
    }
}