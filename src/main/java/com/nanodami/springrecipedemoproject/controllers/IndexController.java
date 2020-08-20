package com.nanodami.springrecipedemoproject.controllers;

import com.nanodami.springrecipedemoproject.domain.Category;
import com.nanodami.springrecipedemoproject.domain.UnitOfMeasure;
import com.nanodami.springrecipedemoproject.repositories.CategoryRepository;
import com.nanodami.springrecipedemoproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("uom id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }

}
