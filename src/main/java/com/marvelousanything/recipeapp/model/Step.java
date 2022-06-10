package com.marvelousanything.recipeapp.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "step")
@IdClass(StepId.class)
@Table(name = "step")
public class Step {

    @Id
    @Column(name = "step_number", nullable = false, insertable = false)
    private Long stepNumber;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false)
    private Recipe recipe;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "recipe_ingredient_id", nullable = false)
    private RecipeIngredient recipeIngredient;

    @Column(name = "instructions", nullable = false)
    private String instructions;

}