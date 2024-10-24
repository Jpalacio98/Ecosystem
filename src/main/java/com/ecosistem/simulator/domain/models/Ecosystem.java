package com.ecosistem.simulator.domain.models;

import java.util.ArrayList;
import java.util.List;

import com.ecosistem.simulator.domain.paterms.factory_method.Animal;
import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;
import com.ecosistem.simulator.domain.paterms.factory_method.Plant;

public class Ecosystem {

    private List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Plant> plants;

    public List<Plant> getPlants() {
        return plants;
    }

    private List<Landscape> landscapes;

    public List<Landscape> getLandscapes() {
        return landscapes;
    }

    public void setLandscapes(List<Landscape> landscapes) {
        this.landscapes = landscapes;
    }

    // Constructor inicializa las listas vacías
    public Ecosystem() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
        this.landscapes = new ArrayList<>();
    }

    public Ecosystem(EcosystemBuilder EcosystemBuilder) {
        this.animals = EcosystemBuilder.animals;
        this.plants = EcosystemBuilder.plants;
        this.landscapes = EcosystemBuilder.landscapes;
    }

    public static class EcosystemBuilder {
        private List<Animal> animals;
        private List<Plant> plants;
        private List<Landscape> landscapes;

        public EcosystemBuilder() {
            this.animals = new ArrayList<>();
            this.plants = new ArrayList<>();
            this.landscapes = new ArrayList<>();
        }

        public EcosystemBuilder addAnimals(Animal animals) {
            this.animals.add(animals);
            return this;
        }

        public EcosystemBuilder addPlants(Plant plants) {
            this.plants.add(plants);
            return this;
        }

        public EcosystemBuilder addLandscapes(Landscape landscapes) {
            this.landscapes.add(landscapes);
            return this;
        }

        public Ecosystem build() {
            return new Ecosystem(this);
        }

    }
}
