package com.priya.cardview1.model;

public class Student {
    private String Name;
    private int Class1;
    private int Age;

    public Student(String Name,int Class1,int Age){

        this.Name=Name;
        this.Class1=Class1;
        this.Age=Age;
    }

    public String getName() {
        return Name;
    }

    public int getClass1(){
        return Class1;
    }

    public int getAge() {
        return Age;
    }
}
