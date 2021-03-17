package com.example.demo.bbs.service;

public interface BoardService{
	public long count();
	public boolean existsById(long id);
	public List<Board> findAll();
	public Board getOne(long id);
	public List<Board> saveAll(Iterable<Board> entities);
	public void deleteById(long Id);
	public Optional<Board> findOne(Example<Board> example);
	
}
