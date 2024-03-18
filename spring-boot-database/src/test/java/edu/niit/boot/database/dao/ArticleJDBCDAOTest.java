package edu.niit.boot.database.dao;

import edu.niit.boot.database.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@SpringBootTest
class ArticleJDBCDAOTest {

    private static final Logger log = LoggerFactory.getLogger(ArticleJDBCDAOTest.class);

    @Autowired
    private ArticleJDBCDAO articleJDBCDAO;

    @Test
    void saveArticle() {
        Article article = Article.builder()
                .author("lxs")
                .title("kaixin")
                .content("chaoren")
                .build();

        int n = articleJDBCDAO.save(article);
        log.info("Saved article with ID: {}", n);

    }

    @Test
    void updateById() {
        Article article = Article.builder()
                .id(1)
                .author("qyt")
                .title("xiaoxin")
                .content("chaoren")
                .build();

        int n = articleJDBCDAO.updateById(article);
        log.info("update article with  {}", articleJDBCDAO.findById(article.getId()));
    }

    @Test
    void findById() {
        Article article = articleJDBCDAO.findById(1);
        System.out.println("**************************************************************");
        System.out.println(article.toString());
        System.out.println("**************************************************************");


    }

    @Test
    void findAll() {
        List<Article> articles = articleJDBCDAO.findAll();
        System.out.println("**************************************************************");
        articles.forEach(System.out::println);
        System.out.println("**************************************************************");
    }

    @Test
    void deleteById() {
        long id = 1;
        int n = articleJDBCDAO.deleteById(id);
        log.info("deleted article with ID: {}", n);
    }
}