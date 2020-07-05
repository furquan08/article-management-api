package com.furquan.article.service;

import java.util.List;

import com.furquan.article.entity.ArticleEntity;

public interface ArticleService {
	
	public ArticleEntity addArticle(ArticleEntity article);
	
	public ArticleEntity getArticle(String id);

	public List<ArticleEntity> getAllArticles(Integer pageNo, Integer pageSize, String sortBy);
	public List<ArticleEntity> getAllArticles();
	
	public void deleteArticle(ArticleEntity entity);
	
	public ArticleEntity getArticleByBody(String body);

}
