package vn.com.huylq.springdataelasticsearchmvp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.huylq.springdataelasticsearchmvp.entity.Article;

public interface ArticleService {

    Page<Article> getArticles(Pageable pageable);

    Article getArticleById(String id);

    Article createArticle(Article article);

    Article updateArticle(String id, Article article);

    void deleteArticle(String id);
}
