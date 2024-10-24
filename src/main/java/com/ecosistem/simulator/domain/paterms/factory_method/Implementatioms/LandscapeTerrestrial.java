package com.ecosistem.simulator.domain.paterms.factory_method.Implementatioms;

import com.ecosistem.simulator.domain.paterms.factory_method.Landscape;

public class LandscapeTerrestrial extends Landscape{
    public String seaLevel;

    public LandscapeTerrestrial(String type, String climate, String area) {
        super(type, climate, area);
    }

    public LandscapeTerrestrial(String type, String climate, String area, String seaLevel) {
        super(type, climate, area);
        this.seaLevel = seaLevel;
    }

    public String getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(String seaLevel) {
        this.seaLevel = seaLevel;
    }

    @Override
    public void changeWeather() {
        
    }

    
}
