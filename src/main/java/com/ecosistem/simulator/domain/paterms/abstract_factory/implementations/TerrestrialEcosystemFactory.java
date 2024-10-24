package com.ecosistem.simulator.domain.paterms.abstract_factory.implementations;


import com.ecosistem.simulator.domain.paterms.abstract_factory.EcosystemFactory;
import com.ecosistem.simulator.domain.paterms.factory_method.Animal;
import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;
import com.ecosistem.simulator.domain.paterms.factory_method.Plant;
import com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms.AnimalTerrestrial;
import com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms.LandscapeTerrestrial;
import com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms.PlantTerretrial;


public class TerrestrialEcosystemFactory implements EcosystemFactory {

    @Override
    public Animal createAnimal(Animal animalTerrestrial) {
    return new AnimalTerrestrial(animalTerrestrial.getName(), animalTerrestrial.getSpecies(), animalTerrestrial.getDiet(), animalTerrestrial.getHabitat(), ((AnimalTerrestrial)animalTerrestrial).getType());
    }

    @Override
    public Plant createPlant(Plant plantTerrestrial) {
        return new PlantTerretrial( plantTerrestrial.getSpecies(), plantTerrestrial.getHabitat(),plantTerrestrial.getGrowthCycle(), ((PlantTerretrial)plantTerrestrial).isHasFruits());
    }

    @Override
    public Landscape createLandscape(Landscape landscapeTerrestrial) {
        return new LandscapeTerrestrial(landscapeTerrestrial.getType(), landscapeTerrestrial.getClimate(), landscapeTerrestrial.getArea(),  ((LandscapeTerrestrial)landscapeTerrestrial).getSeaLevel());
    }
}
