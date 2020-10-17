package com.pokepackage.pokeboot.models.service;

import java.util.List;

import com.pokepackage.pokeboot.models.Pokemon;

public interface PokeService {
    public List<Pokemon> findAll();
	public Pokemon findById(Long id);
}
