package edu.niit.boot.database.mapper;

import edu.niit.boot.database.entity.Article;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticleMapperTest {
    @Resource
    private ArticleMapper articleMapper;
    @Test
    void insertArticle() {
        Article article = Article.builder()
                .author("lxs")
                .title("kaixin")
                .content("chaoren")
                .build();
        articleMapper.insertArticle((article));
    }
}