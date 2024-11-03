package vn.com.huylq.springdataelasticsearchmvp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.com.huylq.springdataelasticsearchmvp.entity.Article;
import vn.com.huylq.springdataelasticsearchmvp.repository.ArticleRepository;
import vn.com.huylq.springdataelasticsearchmvp.service.ArticleService;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public Page<Article> getArticles(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }

    @Override
    public Article getArticleById(String id) {
        return articleRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Article not found"));
    }

    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(String id, Article article) {
        article.setId(id);
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(String id) {
        articleRepository.deleteById(id);
    }
}
