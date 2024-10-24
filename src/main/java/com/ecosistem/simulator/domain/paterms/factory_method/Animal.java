package com.ecosistem.simulator.domain.paterms.factory_method;

public abstract class Animal {
    private String name;
    private String species; // Especie del animal
    private String diet; // Dieta del animal (herbívoro, carnívoro)
    private String habitat; // Hábitat donde vive el animal (bosque, océano, etc.)

    public Animal(String name, String species, String diet, String habitat) {
        this.name = name;
        this.species = species;
        this.diet = diet;
        this.habitat = habitat;
    }

    // Getters y Setters
    public String getSpecies() {
        return species;
    }

    public String getDiet() {
        return diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Método abstracto para el movimiento del animal
    public abstract String move();

    // Método opcional para simular la caza (solo para carnívoros)
    public void hunt() {
        if ("Carnívoro".equalsIgnoreCase(diet)) {
            System.out.println(species + " está cazando en el " + habitat);
        } else {
            System.out.println(species + " no caza porque es " + diet);
        }
    }

}
