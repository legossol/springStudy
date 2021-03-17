package com.example.demo.uss.service;
package java.util.

public interface UserService  {
	public Optional<User> findOne(User t)
	public long count();
	boolean existsById(long id);
	public List<Users> findAll(Sort sort);
	public Optional<Users> findOne();
	public void deleteById(long id)
	public User getOnt(long id);
	public User save(Users entity);
}
