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

import com.travail.springboot.gestionDesArticles.Entity.Bijoux;
import com.travail.springboot.gestionDesArticles.Entity.Categorie;
import com.travail.springboot.gestionDesArticles.Service.BijouxServices;
import com.travail.springboot.gestionDesArticles.Service.CategorieServices;


@Controller
@RequestMapping("/apibijoux")
public class BijouxControlleur {

	@Autowired BijouxServices bs;
	
	@Autowired CategorieServices cs;
	
	@GetMapping("/all")
	public String getAllBijoux(Model m) {
		List<Bijoux> liste = bs.getAllBijoux();
		m.addAttribute("liste",liste);
		return "bijoux";		
	}
	
	@GetMapping("/bijouxmc")
	public String getBijouxPMC(@RequestParam String mc,Model m) {
		List<Bijoux> liste = bs.getBijouxBMC(mc);
		m.addAttribute("liste", liste);
		return "bijoux";
		
	}
	
	@GetMapping("/supprimerbijoux/{id}")
    public String supprimerBijoux(@PathVariable int id) {
		 bs.supprimerBijoux(id);
		return "redirect:/apibijoux/all";
	}
	
	@GetMapping("/ajouterbijoux")
	public String ajouterBijoux(Model m) {
		m.addAttribute("categories", cs.getAllCategorie());		
		return "ajouterbijoux";
	}
	
	@PostMapping("/ajouterbijoux")
	public String ajouter(Model m, Bijoux b, @RequestParam("categorie") int idc,@RequestParam("idb") String idb) {
		Categorie c = cs.getCategorie(idc);
		b.setCategorie(c);
		if(!idb.equals("")) 
			b.setId(Integer.parseInt(idb));
		bs.ajouterBijoux(b);
		return "redirect:/apibijoux/all";
	}
	
	@GetMapping("/modifierbijoux/{idb}")
	public String modifierbijoux(Model m, @PathVariable("idb") int idb) {
		m.addAttribute("categories", cs.getAllCategorie());
		m.addAttribute("bijoux", bs.getAllBijoux());
		return "ajouterbijoux";
	}
	
}
