package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Plant;

public class PlantTerretrial extends Plant{
    private boolean hasFruits;

    public PlantTerretrial(String species, String habitat, String growthCycle) {
        super(species, habitat, growthCycle);
    }

    public PlantTerretrial(String species, String habitat, String growthCycle, boolean hasFruits) {
        super(species, habitat, growthCycle);
        this.hasFruits = hasFruits;
    }

    public boolean isHasFruits() {
        return hasFruits;
    }

    public void setHasFruits(boolean hasFruits) {
        this.hasFruits = hasFruits;
    }

    @Override
    public void grow() {

    }

}
