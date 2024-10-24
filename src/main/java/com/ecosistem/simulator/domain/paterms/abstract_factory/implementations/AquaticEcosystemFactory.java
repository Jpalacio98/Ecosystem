package com.ecosistem.simulator.domain.paterms.abstract_factory.implementations;
import com.ecosistem.simulator.domain.paterms.abstract_factory.EcosystemFactory;
import com.ecosistem.simulator.domain.paterms.factory_method.Animal;
import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;
import com.ecosistem.simulator.domain.paterms.factory_method.Plant;
import com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms.*;




public class AquaticEcosystemFactory implements EcosystemFactory {

   @Override
    public Animal createAnimal(Animal animalAquatic) {
    return new AnimalAquatic(animalAquatic.getName(), animalAquatic.getSpecies(), animalAquatic.getDiet(), animalAquatic.getHabitat(), ((AnimalAquatic)animalAquatic).isSaltwater());
    }

    @Override
    public Plant createPlant(Plant plantAquatic) {
        return new PlantAquatic( plantAquatic.getSpecies(), plantAquatic.getHabitat(),plantAquatic.getGrowthCycle(), ((PlantAquatic)plantAquatic).getDepth());
    }

    @Override
    public Landscape createLandscape(Landscape landscapeAquatic) {
        return new LandscapeAquatic(landscapeAquatic.getType(), landscapeAquatic.getClimate(), landscapeAquatic.getArea(),  ((LandscapeAquatic)landscapeAquatic).isSaltwater());
    }
}
