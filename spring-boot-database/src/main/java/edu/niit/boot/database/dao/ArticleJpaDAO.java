package edu.niit.boot.database.dao;

import edu.niit.boot.database.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleJpaDAO extends JpaRepository<Article,Integer> {

}
