package com.travail.springboot.gestionDesArticles.Service;

import java.util.List;

import com.travail.springboot.gestionDesArticles.Entity.Bijoux;

public interface IservicesBijoux {

	public void ajouterBijoux(Bijoux b);
	public void supprimerBijoux(int id);
	public void mettreAJourBijoux(Bijoux b);
	public List<Bijoux> getAllBijoux();
	public List<Bijoux> getBijouxBMC(String mocle);
	public Bijoux getBijoux(int id);
}
