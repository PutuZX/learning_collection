package com.enigma.collection;

public class People {
    private String name;
    private int age;
    private Character gender;
    private String hobbies;
    
    People(String name, int age, Character gender, String hobbies){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Character getGender(){
        return this.gender;
    }

    public String getHobbies(){
        return this.hobbies;
    }

    public void setHobbies(String hobbies){
        this.hobbies = hobbies;
    }

    @Override
    public String toString(){
        return "{ " + name + ", " + age + ", " + gender + " }";
    }
}
