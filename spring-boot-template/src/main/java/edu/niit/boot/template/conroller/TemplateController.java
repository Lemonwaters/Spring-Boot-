package edu.niit.boot.template.conroller;
import edu.niit.boot.template.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/template")
public class TemplateController {
    @GetMapping("/freemarker")
    public String freemarkerIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "Spring Boot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        return "freemarker-demo";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "Spring Boot")
        );
        model.addAttribute("articles", articles);
        return "thymeleaf-demo";
    }
}