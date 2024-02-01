package com.apocalypse.restrobot.Robot;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Robot {
    private String model;
    private String serialNumber;
    private LocalDateTime manufacturedDate;
    private String Category;
    @Id
    private Long id;

    public Robot() {
    }

    public Robot(String model,
                 String serialNumber,
                 LocalDateTime manufacturedDate,
                 String category) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.manufacturedDate = manufacturedDate;
        Category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", manufacturedDate=" + manufacturedDate +
                ", Category='" + Category + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
