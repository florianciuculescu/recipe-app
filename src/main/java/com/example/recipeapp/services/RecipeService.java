package com.example.recipeapp.services;

import com.example.recipeapp.commands.RecipeCommand;
import com.example.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    void deleteById(Long idToDelete);
}
