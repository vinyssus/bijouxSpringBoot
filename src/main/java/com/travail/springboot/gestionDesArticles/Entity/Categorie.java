package com.travail.springboot.gestionDesArticles.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;




@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	//@JsonProperty(access = Access.WRITE_ONLY)
	List<Bijoux> liste = new ArrayList<>();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Bijoux> getListe() {
		return liste;
	}
	public void setListe(List<Bijoux> liste) {
		this.liste = liste;
	}
	
	public int getListeLength() {
		if(!this.liste.isEmpty()) {
			return liste.size();
		}
		return 0;
		
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", liste=" + liste + "]";
	}

	public Categorie(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Categorie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
