package com.travail.springboot.gestionDesArticles.Controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.travail.springboot.gestionDesArticles.Entity.Categorie;
import com.travail.springboot.gestionDesArticles.Service.CategorieServices;
import com.travail.springboot.gestionDesArticles.dao.CategorieRepository;

@Controller
@RequestMapping("/apicategorie")
public class CategorieControlleur {

@Autowired CategorieRepository cr;
	
	@Autowired CategorieServices cs;
	
	@GetMapping("/all")
	public String getAllcategorie(Model m) {
		List<Categorie> listec = cs.getAllCategorie();
		m.addAttribute("listec", listec);
		m.addAttribute("categorie", cr.findAll());
		return "categories";
	}
	
	@GetMapping("/supprimercategorie/{id}")
	public String supprimercategorie(@PathVariable int id) {
		cs.supprimerCategorie(id);
		return "redirect:/apicategorie/all";
	}
	
	@GetMapping("/ajoutercategorie")
	public String ajoutercategorie(Model m) {
		m.addAttribute("listec", cs.getAllCategorie());
		return "categories";
	}
	
	@GetMapping("modifiercategorie")
	public String modifiercategorie(Model m , @PathVariable("idc") int id) {
		m.addAttribute("categorie", cs.getCategorie(id));
		m.addAttribute("listec", cs.getAllCategorie());
		return "cetegorie";	
	}
	
	@PostMapping("/ajoutercategorie")
	public String ajouter(Model m,Categorie c,@RequestParam("idc") String idc) {
		if(!idc.equals("")) {
			c.setId(Integer.parseInt(idc));
		}
		cs.ajouterCategorie(c);
		return "redirect:/apicategorie/all";
		
	}
}
