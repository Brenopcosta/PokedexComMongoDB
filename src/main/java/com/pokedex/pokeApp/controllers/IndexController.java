package com.pokedex.pokeApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pokedex.pokeApp.models.Pokemon;
import com.pokedex.pokeApp.repository.PokemonRepository;

@Controller
public class IndexController {
	
	List<Pokemon> pokemons;

	@Autowired
	PokemonRepository pokemonRepository;
	
	@RequestMapping("/")
	public String popularPokemons() {
		
		pokemons = pokemonRepository.findAll();
		
		System.out.println(pokemons.get(0).getDescription());
		
		return "ok";
		
	}
	
}
