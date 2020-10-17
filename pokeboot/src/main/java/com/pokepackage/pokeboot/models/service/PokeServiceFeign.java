package com.pokepackage.pokeboot.models.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pokepackage.pokeboot.clientes.PokemonClienteRest;
import com.pokepackage.pokeboot.models.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign")
public class PokeServiceFeign implements PokeService {
    @Autowired
	private PokemonClienteRest clienteFeign;

	@Override
	public List<Pokemon> findAll() {
		return clienteFeign.listar();
	}

	@Override
	public Pokemon findById(Long id) {
		return clienteFeign.detalle(id);
	}
}
