package com.pokepackage.pokeboot.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pokepackage.pokeboot.models.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("serviceRestTemplate")
public class PokeServiceImpl implements PokeService{
    @Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Pokemon> findAll() {
		List<Pokemon> pokemones = Arrays.asList(clienteRest.getForObject("http://servicio-productos/listar", Pokemon[].class));
		
		return pokemones;
	}

	@Override
	public Pokemon findById(Long id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Pokemon pokemon = clienteRest.getForObject("http://servicio-productos/ver/{id}", Pokemon.class, pathVariables);
		return pokemon;
	}
}
