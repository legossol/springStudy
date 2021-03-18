package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.Admin;
import com.example.demo.uss.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl extends AbstractService<Admin>{
    @Autowired AdminRepository repo;
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
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Optional<Admin> findOne() {
        return null;
    }

    @Override
    public void deleteById(long id) {
        
    }

    @Override
    public Admin getOne(long id) {
        return null;
    }

    @Override
    public Admin save(Admin entity) {
        return null;
    }

}
