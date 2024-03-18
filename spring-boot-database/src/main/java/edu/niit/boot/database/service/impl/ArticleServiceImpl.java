package edu.niit.boot.database.service.impl;

import edu.niit.boot.database.dao.ArticleJpaDAO;
import edu.niit.boot.database.entity.Article;
import edu.niit.boot.database.service.ArticleJpaService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleJpaService {
    @Resource
    private ArticleJpaDAO articleJpaDAO;
    @Override
    public void saveArticle(Article article) {
        articleJpaDAO.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleJpaDAO.save(article);
    }

    @Override
    public Article getArticleById(int id) {
        Optional<Article> articleOptional = articleJpaDAO.findById(id);
        return articleOptional.orElse(null);
    }

    @Override
    public List<Article> findAll() {
        return articleJpaDAO.findAll();
    }

    @Override
    public void deleteArticle(int id) {
        articleJpaDAO.deleteById(id);
    }
}
