package com.travail.springboot.gestionDesArticles.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
public class Bijoux {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private double prix;
	
	@ManyToOne
	private Categorie categorie;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Bijoux [id=" + id + ", nom=" + nom + ", prix=" + prix + ", categorie=" + categorie + "]";
	}

	public Bijoux(Integer id, String nom, double prix, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.categorie = categorie;
	}

	public Bijoux() {
		super();
	}
	
	
}
