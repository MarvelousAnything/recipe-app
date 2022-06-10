package com.marvelousanything.recipeapp.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class StepId implements Serializable {
    private Long stepNumber;
    private Long recipe;
}