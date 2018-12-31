package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void createArticle();
	public ArrayList<ArticleBean> findAll();
	public ArrayList<ArticleBean> findWriter();
	public ArticleBean findTitle();
	public int countSeq();
	public void updateArticle();
	public void deleteSeq();
	
}
