package com.example.demo.uss.repository;

import com.example.demo.uss.domain.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

interface AdmionCustomRepository{

}
public interface AdminRepository extends JpaRepository<Admin, Long>,
AdmionCustomRepository{

}

