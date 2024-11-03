package vn.com.huylq.springdataelasticsearchmvp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vn.com.huylq.springdataelasticsearchmvp.entity.Article;
import vn.com.huylq.springdataelasticsearchmvp.service.ArticleService;

@RestController
@RequestMapping("/v1/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public Page<Article> getArticles(Pageable pageable) {
        return articleService.getArticles(pageable);
    }

    @GetMapping("/{id}")
    public Article getArticles(@PathVariable("id") String id) {
        return articleService.getArticleById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Article createArticle(@RequestBody Article article) {
        return articleService.createArticle(article);
    }

    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable("id") String id, @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArticle(@PathVariable("id") String id) {
        articleService.deleteArticle(id);
    }
}
