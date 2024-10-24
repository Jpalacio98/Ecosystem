package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Animal;

public class AnimalAquatic extends Animal {
    private boolean isSaltwater;

    
    public AnimalAquatic(String name, String species, String diet, String habitat, boolean isSaltwater) {
        super(name, species, diet, habitat);
        this.isSaltwater = isSaltwater;
    }

    public AnimalAquatic(String name, String species, String diet, String habitat) {
        super(name, species, diet, habitat);
    }

    @Override
    public String move() {
        return "El " + getName() + " se esta nadando";
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean isSaltwater) {
        this.isSaltwater = isSaltwater;
    }

}
