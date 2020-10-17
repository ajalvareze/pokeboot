package com.pokepackage.pokeboot.controllers;

import java.util.List;

import com.pokepackage.pokeboot.models.Pokemon;
import com.pokepackage.pokeboot.models.service.PokeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PokeController {
    private static Logger log = LoggerFactory.getLogger(PokeController.class);
	
	@Autowired
	@Qualifier("serviceFeign")
	private PokeService pokeService;
	
	@GetMapping("/listar")
	public List<Pokemon> listar(){
		return pokeService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Pokemon detalle(@PathVariable Long id) {
		return pokeService.findById(id);
	}
}
