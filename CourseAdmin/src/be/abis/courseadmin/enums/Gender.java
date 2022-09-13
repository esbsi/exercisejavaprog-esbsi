package be.abis.courseadmin.enums;

public enum Gender {

    FEMALE("f", "she", "her", "her"),MALE("m", "he", "him", "his"),OTHER("o", "they", "them", "their");

    private String description;
    private String personalPronoun;
    private String objectivePronoun;
    private String possessivePronoun;


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
