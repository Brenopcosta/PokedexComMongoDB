package com.pokedex.pokeApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokedex.pokeApp.models.Pokemon;
import com.pokedex.pokeApp.repository.PokemonRepository;

@Service
public class PokemonService {
	
	@Autowired
	private PokemonRepository pokemonRepository;
	
	public void salvar(String pkdx_id,String national_id, String name, String __v, String image_url, String description, String art_url, List<String> types, List<String> evolutions) {
		pokemonRepository.save(new Pokemon(pkdx_id, national_id,  name,  __v,  image_url,  description,  art_url, types,  evolutions));
    }
	
	public List<Pokemon> findAll(){
		return pokemonRepository.findAll();
	}
	
	
}
