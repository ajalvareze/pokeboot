package com.pokepackage.pokeboot.models;

import java.util.List;

public class Pokemon {
    private Habilidad habilidades;
    private Integer base_experience;
    private Form forms;
    private List<GameIndex> game_indices;
    private Integer height;
    private List<Item> held_items;
    private Integer id;
    private boolean is_default;
    private List<Encounter> location_area_encounters;
    private List<Move> moves;
    private String name;
    private Integer order;
    private Species species;
    private Sprite sprites;
    private List<Stat> stats;
    private List<Type> types;


    public Pokemon() {
    }

    public Pokemon(Habilidad habilidades, Integer base_experience, Form forms, List<GameIndex> game_indices, Integer height, List<Item> held_items, Integer id, boolean is_default, List<Encounter> location_area_encounters, List<Move> moves, String name, Integer order, Species species, Sprite sprites, List<Stat> stats, List<Type> types) {
        this.habilidades = habilidades;
        this.base_experience = base_experience;
        this.forms = forms;
        this.game_indices = game_indices;
        this.height = height;
        this.held_items = held_items;
        this.id = id;
        this.is_default = is_default;
        this.location_area_encounters = location_area_encounters;
        this.moves = moves;
        this.name = name;
        this.order = order;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
    }

    public Habilidad getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(Habilidad habilidades) {
        this.habilidades = habilidades;
    }

    public Integer getBase_experience() {
        return this.base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public Form getForms() {
        return this.forms;
    }

    public void setForms(Form forms) {
        this.forms = forms;
    }

    public List<GameIndex> getGame_indices() {
        return this.game_indices;
    }

    public void setGame_indices(List<GameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<Item> getHeld_items() {
        return this.held_items;
    }

    public void setHeld_items(List<Item> held_items) {
        this.held_items = held_items;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return this.is_default;
    }

    public boolean getIs_default() {
        return this.is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public List<Encounter> getLocation_area_encounters() {
        return this.location_area_encounters;
    }

    public void setLocation_area_encounters(List<Encounter> location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public List<Move> getMoves() {
        return this.moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Species getSpecies() {
        return this.species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprite getSprites() {
        return this.sprites;
    }

    public void setSprites(Sprite sprites) {
        this.sprites = sprites;
    }

    public List<Stat> getStats() {
        return this.stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Type> getTypes() {
        return this.types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

}
