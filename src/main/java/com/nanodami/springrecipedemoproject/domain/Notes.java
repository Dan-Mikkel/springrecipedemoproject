package com.nanodami.springrecipedemoproject.domain;

import javax.persistence.Entity;

@Entity
public class Notes {
    private String notes;

    //Relationships

    private Recipe recipes;

    //Getters and setters

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Recipe getRecipes() {
        return recipes;
    }

    public void setRecipes(Recipe recipes) {
        this.recipes = recipes;
    }
}
