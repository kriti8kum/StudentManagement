package spring.example.spring.API.models;

import java.beans.ConstructorProperties;

public class Student {
    String id;
    String name;
    int rollNumber;

    public Student(){

    }
    public Student(String id, String name, int rollNumber){
        this.id = id;
        this.name= name;
        this.rollNumber = rollNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


}
