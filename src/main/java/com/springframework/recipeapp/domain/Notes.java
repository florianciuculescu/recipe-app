package com.springframework.recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = "recipe")
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * If Note is deleted, Recipe will remain in the db
     */
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
