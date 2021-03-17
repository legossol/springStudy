package com.example.demo.bbs.service;

public interface ArticleService {
	public Optional<Article> findById(long id);
	public List<Article> findAll();
	public long count();
	public Article getOne(long id);
	public void deleteById(long id);
	public Article save(Article Entity);
	public boolean existsById(long id);

}
