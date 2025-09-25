package com.gaming_club.dto.response;


public class GameResponse {
    private int id;
    private String name;
    private String description;
    private String category;
    private double costPerMinute;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }
   
    public Double getCostPerMinute() {
        return costPerMinute;
    }


    public void setCostPerMinute(Double costPerMinute) {
        this.costPerMinute = costPerMinute;
    }
}
