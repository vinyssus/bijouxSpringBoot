package com.travail.springboot.gestionDesArticles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travail.springboot.gestionDesArticles.Entity.Categorie;
import com.travail.springboot.gestionDesArticles.dao.CategorieRepository;

@Service
public class CategorieServices implements IservicesCategorie{

	@Autowired CategorieRepository cr;
	
	@Override
	public void ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public List<Categorie> getAllCategorie() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Categorie getCategorie(int id) {
		// TODO Auto-generated method stub
		return cr.getById(id);
	}

	@Override
	public void supprimerCategorie(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

}
