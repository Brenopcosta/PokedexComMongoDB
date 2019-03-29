package com.pokedex.pokeApp.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemonsImages")
public class Pokemon {
	
	@Id
	private String id;
	
	private String pkdx_id;
	private String national_id;
	private String name;
	private String __v;
	private String image_url;
	private String description;
	private String art_url;
	private List<String> types; 
	private List<String> evolutions;
	
	
		
	public Pokemon( String pkdx_id,String national_id, String name, String __v, String image_url, String description, String art_url, List<String> types, List<String> evolutions){
		this.pkdx_id = pkdx_id;
		this.national_id = national_id;
		this.name = name;
		this.__v = __v;
		this.image_url = image_url;
		this.description = description;
		this.art_url = art_url;
		this.types = types;
		this.evolutions = evolutions;	
	}
	
	@Override
	public String toString() {
		return String.format("About the pokemon %s: %s", name , description);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPkdx_id() {
		return pkdx_id;
	}
	public void setPkdx_id(String pkdx_id) {
		this.pkdx_id = pkdx_id;
	}
	public String getNational_id() {
		return national_id;
	}
	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String get__v() {
		return __v;
	}
	public void set__v(String __v) {
		this.__v = __v;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getArt_url() {
		return art_url;
	}
	public void setArt_url(String art_url) {
		this.art_url = art_url;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public List<String> getEvolutions() {
		return evolutions;
	}
	public void setEvolutions(List<String> evolutions) {
		this.evolutions = evolutions;
	}
	
	
	
}
