package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Plant;

public class PlantAquatic extends Plant{
    public String depth;

    public PlantAquatic(String species, String habitat, String growthCycle) {
        super(species, habitat, growthCycle);
    }

    public PlantAquatic(String species, String habitat, String growthCycle, String depth) {
        super(species, habitat, growthCycle);
        this.depth = depth;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public void grow() {
       
    }
    
}
