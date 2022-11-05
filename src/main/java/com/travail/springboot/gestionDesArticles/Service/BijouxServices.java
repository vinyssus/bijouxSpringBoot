package com.travail.springboot.gestionDesArticles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travail.springboot.gestionDesArticles.Entity.Bijoux;
import com.travail.springboot.gestionDesArticles.dao.BijouxRepository;

@Service
public class BijouxServices implements IservicesBijoux{

	@Autowired BijouxRepository bj;
	
	@Override
	public void ajouterBijoux(Bijoux b) {
		// TODO Auto-generated method stub
		bj.save(b);
	}

	@Override
	public void supprimerBijoux(int id) {
		// TODO Auto-generated method stub
		bj.deleteById(id);
	}

	@Override
	public void mettreAJourBijoux(Bijoux b) {
		// TODO Auto-generated method stub
		bj.save(b);
	}

	@Override
	public List<Bijoux> getAllBijoux() {
		// TODO Auto-generated method stub
		return bj.findAll();
	}

	@Override
	public List<Bijoux> getBijouxBMC(String mocle) {
		// TODO Auto-generated method stub
		return bj.findByNomContains(mocle);
	}

	@Override
	public Bijoux getBijoux(int id) {
		// TODO Auto-generated method stub
		return bj.getById(id);
	}

}
