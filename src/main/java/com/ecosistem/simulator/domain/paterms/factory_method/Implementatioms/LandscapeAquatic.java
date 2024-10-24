package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;

public class LandscapeAquatic extends Landscape{
    private boolean isSaltwater;

    public LandscapeAquatic(String type, String climate, String area) {
        super(type, climate, area);
    }

    public LandscapeAquatic(String type, String climate, String area, boolean isSaltwater) {
        super(type, climate, area);
        this.isSaltwater = isSaltwater;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean isSaltwater) {
        this.isSaltwater = isSaltwater;
    }

    @Override
    public void changeWeather() {
        
    }
    
}
