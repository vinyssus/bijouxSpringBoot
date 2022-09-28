package com.travail.springboot.gestionDesArticles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.travail.springboot.gestionDesArticles.Entity.Bijoux;
//import com.travail.springboot.gestionDesArticles.Entity.Categorie;
import com.travail.springboot.gestionDesArticles.dao.BijouxRepository;
import com.travail.springboot.gestionDesArticles.dao.CategorieRepository;

@SpringBootApplication
public class GestionDesArticlesApplication implements CommandLineRunner{

	@Autowired CategorieRepository cr;
	@Autowired BijouxRepository bj;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionDesArticlesApplication.class, args);
	}

	
	public void run(String ...args) throws Exception{
//		Categorie c1 = new Categorie(1,"montre");
//		Categorie c2 = new Categorie(2,"bracelet");
//	
//		cr.save(c1);
//		cr.save(c2);
//		
//		Bijoux b1 = new Bijoux(1,"swatch",1200,c1);
//		Bijoux b2 = new Bijoux(2,"Rolex",1600,c2);
//		
//		bj.save(b1);
//		bj.save(b2);
	}
}
