
package com.example.Java_Basics.model.Level4;


public class Student {
    
    private String name, grade;
    private int age;

    public Student() {
    }

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }  

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String newGrade) {
        this.grade = newGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

}
