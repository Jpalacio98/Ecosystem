package com.ecosistem.simulator.domain.paterms.factory_method;

public abstract class Plant {
    private String species; // Especie de la planta
    private String habitat; // Hábitat de la planta (bosque, océano, etc.)
    private String growthCycle; // Ciclo de crecimiento de la planta (anual, continuo, etc.)

    public Plant(String species, String habitat, String growthCycle) {
        this.species = species;
        this.habitat = habitat;
        this.growthCycle = growthCycle;
    }

    // Getters y Setters
    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGrowthCycle() {
        return growthCycle;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGrowthCycle(String growthCycle) {
        this.growthCycle = growthCycle;
    }

    // Método abstracto para simular el crecimiento de la planta
    public abstract void grow();
}
