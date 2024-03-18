package edu.niit.boot.database.service;

import edu.niit.boot.database.entity.Article;

import java.util.List;

/**
 * @author 31807
 */
public interface ArticleJpaService {
    void saveArticle(Article article);

    void updateArticle(Article article);

    Article getArticleById(int id);

    List<Article> findAll();

    void deleteArticle(int id);
}
