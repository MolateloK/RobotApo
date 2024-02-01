package com.apocalypse.restrobot.Survivor;

import jakarta.persistence.*;

@Entity
@Table
public class Survivor {
    @Id
    @SequenceGenerator(
            name = "survivor_sequence",
            sequenceName = "survivor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "survivor_sequence"
    )
    @Column(name = "infection_report")
    private  int infectionReport;

    private Integer id;
    private String Name;
    private String Gender;
    private Integer age;
    private boolean infected;
    @Embedded
    private Location lastlocation;


    public Survivor() {
    }

    public Survivor(Integer id,
                    String name,
                    String gender,
                    Integer age) {
        this.id = id;
        Name = name;
        Gender = gender;
        this.age = age;
    }

    public Survivor(String name,
                    String gender,
                    Integer age) {
        Name = name;
        Gender = gender;
        this.age = age;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public  int getInfectionReport(){
        return infectionReport;
    }
    public void incrementInfectionReport(){
        this.infectionReport++ ;
    }


    @Override
    public String toString() {
        return "Survivor{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", age=" + age +
                ", location=" + lastlocation +
                 ", infected=" + infected +
                '}';
    }
}
