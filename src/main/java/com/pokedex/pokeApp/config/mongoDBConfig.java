package com.pokedex.pokeApp.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.pokedex.pokeApp.repository.PokemonRepository;

@EnableMongoRepositories(basePackageClasses = PokemonRepository.class)
@Configuration
public class mongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(PokemonRepository pokemonRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {				
			}
		};
		
	}
}
