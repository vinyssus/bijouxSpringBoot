package com.travail.springboot.gestionDesArticles.Service;

import java.util.List;

import com.travail.springboot.gestionDesArticles.Entity.Categorie;

public interface IservicesCategorie {

	public void ajouterCategorie(Categorie c);
	public List<Categorie> getAllCategorie();
	public Categorie getCategorie(int id);
	public void supprimerCategorie(int id);
}
