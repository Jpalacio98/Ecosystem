package com.ecosistem.simulator.domain.paterms.factory_method;

public abstract class Landscape {
    private String type; // Tipo de paisaje (montaña, río, lago, etc.)
    private String climate;
    private String area;

    public Landscape(String type, String climate, String area) {
        this.type = type;
        this.climate = climate;
        this.area = area;
    }

    // Getter & Setter
    public String getType() {
        return type;
    }

    public String getClimate() {
        return climate;
    }

    public String getArea() {
        return area;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Método abstracto para simular un cambio climático en el paisaje
    public abstract void changeWeather();
}
