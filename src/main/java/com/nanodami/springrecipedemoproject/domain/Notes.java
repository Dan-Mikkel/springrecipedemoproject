package com.nanodami.springrecipedemoproject.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Lob
    private String notes;

    //Relationships
    @OneToOne
    private Recipe recipes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
