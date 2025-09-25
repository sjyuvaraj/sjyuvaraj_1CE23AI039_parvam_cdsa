package com.gaming_club.model;


@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

                                                                            
    private String description;
      
    private String category;


    private double costPerMinute;


    // Getters & Setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description description;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category category;
    }


    public double getCostPerMinute() {
        return costPerMinute;
    }


    public void setCostPerMinute(double costPerMinute) {
        this.costPerMinute costPerMinute;
    }
}
