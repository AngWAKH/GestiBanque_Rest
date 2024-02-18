package com.gk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.entities.Banque;
import com.gk.repositories.BanqueRepository;

@Service
public class BanqueService {
	
	@Autowired
	BanqueRepository banqueRepository;
	
	public List<Banque> listBanque(){
		return (List<Banque>) banqueRepository.findAll();	
		}
	
	
	public Banque saveBanque(Banque banque) {
		return banqueRepository.save(banque); //cette méthode sert aussi bien pour l'ajout ou modification 
	}
	
	
	
	
	public void deleteBanque(int idBanque) {
		banqueRepository.deleteById(idBanque);
	}
	

}
