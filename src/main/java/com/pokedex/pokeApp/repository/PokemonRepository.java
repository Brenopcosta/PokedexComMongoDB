package com.pokedex.pokeApp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pokedex.pokeApp.models.Pokemon;

public interface PokemonRepository extends MongoRepository<Pokemon, String>{
	public Optional<Pokemon> findById(String d);
}
