package com.gaming_club.dto.request;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class GameRequest {
    @NotBlank(message = "Game name is required")
    private String name;


    @NotBlank(message = "Game Description is required")
    @Min(value = 5, message = "Game Description should be more than 5 characters")
    private String description;


    @NotBlank(message = "Category is required")
    private String category;


    @NotBlank(message = "Cost Per Minute cannot be empty")
    @Min(value = 1, message = "Cost Per Minute must me at least 1")
    private Double costPerMinute;


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

