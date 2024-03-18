package edu.niit.boot.template.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author 31807
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class Article {
    private Integer id;
    private String title;
    private String author;
}
