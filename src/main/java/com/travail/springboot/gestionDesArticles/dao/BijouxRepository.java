package com.travail.springboot.gestionDesArticles.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travail.springboot.gestionDesArticles.Entity.Bijoux;

public interface BijouxRepository extends JpaRepository<Bijoux, Integer>{

	List<Bijoux> findByNomContains(String mc);
}
