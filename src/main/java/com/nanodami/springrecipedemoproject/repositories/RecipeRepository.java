package com.nanodami.springrecipedemoproject.repositories;

import com.nanodami.springrecipedemoproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
