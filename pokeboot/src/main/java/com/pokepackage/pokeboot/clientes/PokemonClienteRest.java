package com.pokepackage.pokeboot.clientes;

import java.util.List;

import com.pokepackage.pokeboot.models.Pokemon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "servicio-productos")
public interface PokemonClienteRest {
    @GetMapping("/listar")
	public List<Pokemon> listar();
	
	@GetMapping("/ver/{id}")
	public Pokemon detalle(@PathVariable Long id);
}
