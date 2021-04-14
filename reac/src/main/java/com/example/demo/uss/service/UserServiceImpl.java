package com.example.demo.uss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

@Service 
public class UserServiceImpl extends AbstractService<User>{
	@Autowired UserRepository repo;
	void test() {
		
	}
	@Override
	public long count() {
		return repo.count();
	}
	@Override
	public boolean existsById(long id) {
		return repo.existsById(id);
	}
	@Override
	public List<User> findAll() {
		return null;
	}
	@Override
	public Optional<User> findOne() {
		return null;
	}
	@Override
	public void deleteById(long id) {
		
	}
	@Override
	public User getOne(long id) {
		return null;
	}
	@Override
	public User save(User entity) {
		return null;
	}
	

	
	
}
