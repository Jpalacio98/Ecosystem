package com.ecosistem.simulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecosistem.simulator.domain.models.Ecosystem;
import com.ecosistem.simulator.domain.paterms.abstract_factory.*;

import com.ecosistem.simulator.domain.paterms.factory_method.*;
import com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms.*;

@RestController
@RequestMapping("/app/ecosystem")
public class EcosystemController {

    @GetMapping("/create")
    public ResponseEntity<?> createEcosystem() {
        EcosystemFactory factory = EcosystemFactoryImplements.CreateEcosystem("terrestrial");
        Animal animal = factory.createAnimal(new AnimalTerrestrial("leon", "Africano", "Carivoro", "sabana", "mamaifero"));
        Animal animal2 = factory.createAnimal(new AnimalTerrestrial("Gacela", "Caoka", "hervivoro", "sabana", "mamaifero"));
        Plant plant = factory.createPlant(new PlantTerretrial("Arbuto", "Sanana", "lento", false));
        Plant plant2 = factory.createPlant(new PlantTerretrial("Aborl", "Sanana", "Muy lento", false));
        Plant plant3 = factory.createPlant(new PlantTerretrial("Arbuto", "Sanana", "Muy lento", true));
        Landscape landscape = factory.createLandscape(new LandscapeTerrestrial("Rio", "humedo", "1km", "1500m"));
        Ecosystem ecosystem = new Ecosystem.EcosystemBuilder()
        .addAnimals(animal)
        .addAnimals(animal2)
        .addPlants(plant)
        .addPlants(plant2)
        .addPlants(plant3)
        .addLandscapes(landscape)
        .build();
        return ResponseEntity.ok(ecosystem);
    }
}

