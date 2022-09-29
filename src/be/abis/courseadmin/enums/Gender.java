package be.abis.courseadmin.enums;

import be.abis.courseadmin.model.Person;

public enum Gender {

    FEMALE("f", "she", "her", "her"),MALE("m", "he", "him", "his"),OTHER("o", "they", "them", "their");

    private final String description;
    private final String personalPronoun;
    private final String objectivePronoun;
    private final String possessivePronoun;


    Gender(String description, String personalPronoun, String objectivePronoun, String possessivePronoun) {
        this.description = description;
        this.personalPronoun = personalPronoun;
        this.objectivePronoun = objectivePronoun;
        this.possessivePronoun = possessivePronoun;
    }


    public String getDescription() {
        return description;
    }

    public String getPersonalPronoun() {
        return personalPronoun;
    }

    public String getObjectivePronoun() {
        return objectivePronoun;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }
}
