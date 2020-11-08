package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double heightInches;
    private String hairColor;
    private boolean employed;
    private String eyeColor;
    private String faveColor;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {
        this.name = "Leon";
    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(Double heightInches) {
        this.heightInches = heightInches;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEmployed(Boolean employed) {
        this.employed = employed;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setFaveColor(String faveColor) {
        this.faveColor = faveColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return heightInches;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Boolean getEmployed() {
        return employed;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getFaveColor() {
        return faveColor;
    }
}
