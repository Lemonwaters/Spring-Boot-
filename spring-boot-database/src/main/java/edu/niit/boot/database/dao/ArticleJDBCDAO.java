package edu.niit.boot.database.dao;

import edu.niit.boot.database.entity.Article;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 31807
 */
@Repository // 持久层
public class ArticleJDBCDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(Article article) {
        String sql = "INSERT INTO t_article (author,title,content) VALUES (?,?,?) ";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent());
    }

    /**
     * 更新文章
     *
     * @param article 入参对象
     * @return 受影响的记录行数
     */
    public int updateById(Article article) {
        String sql = "UPDATE t_article SET author = ?, title = ?, content = ? WHERE id = ?";
        return jdbcTemplate.update(sql,
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getId()
        );
    }

    /**
     * 根据 id 查找文章
     *
     * @param id 文章id
     * @return 文章对象
     */
    public Article findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM t_article WHERE id = ? ",
                new Object[]{id}, new BeanPropertyRowMapper<>(Article.class));
    }

    /**
     * 查询所有文章
     *
     * @return 文章集合
     */
    public List<Article> findAll() {
        return jdbcTemplate.query("SELECT * FROM t_article ", new BeanPropertyRowMapper<>(Article.class));
    }

    /**
     * 根据 id 删除文章
     *
     * @param id 文章id
     * @return 受影响的行数
     */
    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM t_article WHERE id = ? ", id);
    }

}
