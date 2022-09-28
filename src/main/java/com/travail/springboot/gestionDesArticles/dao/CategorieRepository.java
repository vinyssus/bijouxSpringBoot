package com.travail.springboot.gestionDesArticles.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travail.springboot.gestionDesArticles.Entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

}
