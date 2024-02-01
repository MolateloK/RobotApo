package com.apocalypse.restrobot.Survivor;

public class Inventory {
    private Integer water;
    private Integer food;
    private Integer medication;
    private Integer Ammunition;

    public Inventory() {
    }

    public Inventory(Integer water,
                     Integer food,
                     Integer medication,
                     Integer ammunition) {
        this.water = water;
        this.food = food;
        this.medication = medication;
        Ammunition = ammunition;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Integer getMedication() {
        return medication;
    }

    public void setMedication(Integer medication) {
        this.medication = medication;
    }

    public Integer getAmmunition() {
        return Ammunition;
    }

    public void setAmmunition(Integer ammunition) {
        Ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "water=" + water +
                ", food=" + food +
                ", medication=" + medication +
                ", Ammunition=" + Ammunition +
                '}';
    }
}
