package com.nanodami.springrecipedemoproject.repositories;

import com.nanodami.springrecipedemoproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
