package com.ecosistem.simulator.domain.paterms.abstract_factory;

import com.ecosistem.simulator.domain.paterms.factory_method.Animal;
import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;
import com.ecosistem.simulator.domain.paterms.factory_method.Plant;

public interface EcosystemFactory {
    Animal createAnimal(Animal animal);

    Plant createPlant(Plant plant);

    Landscape createLandscape(Landscape landscape);
}
