package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Animal;

public class AnimalTerrestrial extends Animal{

    private String type;

    public AnimalTerrestrial(String name, String species, String diet, String habitat) {
        super(name, species, diet, habitat);
    }
    
    public AnimalTerrestrial(String name, String species, String diet, String habitat, String type) {
        super(name, species, diet, habitat);
        this.type = type;
    }

      public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String move() {
        return "El "+getName() +" se esta moviendo";
    }

  

}
