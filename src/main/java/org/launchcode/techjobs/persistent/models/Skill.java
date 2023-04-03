package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, min = 25, message = "Sorry entry must be between 25 and 500 characters long.")
    private String description;

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(String skill) {
        super();
        this.description = skill;
    }

    public String getSkill() {
        return description;
    }

    public void setSkill(String skill) {
        this.description = skill;
    }
}