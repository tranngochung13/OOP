/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author hung.tran
 */
import java.util.ArrayList;

public class Student {

private String student;
private String courseName;
private double grade;
private double avg;
private double total;
private double max;
private double min;

//Constructor w/o arguments
public Student() {
    this.student = "Hung";
    this.courseName = "Tran";
    this.grade = 1.0;
}

//Constructor with arguments
public Student(String student, String courseName, double grade, double avg, double total, double max, double min) {
    this.student = student;
    this.courseName = courseName;
    this.grade = grade;
}

//Getters
public String getStudent(){
    return this.student;
}
public String getCourseName() {
    return this.courseName;
}


//Setters
public void setStudent(String student) {
    this.student = student;
}
public void setCourseName(String courseName) {
    this.courseName = courseName;
}


//Returns average off the 10 grades
public double calculateAvg() {
    total += grade; //add all grades for average
    avg = total / 10;
    return avg;
}

//Highest Grade
public double highGrade() {
    return max = Math.max(grade, max);
}
//Lowest Grade
public double lowGrade() {
    return min = Math.min(grade, min);
}
ArrayList<Student>listGrades = new ArrayList<Student>();
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent("Hung");
        s.getStudent();
        s.listGrades.add(s);
        System.out.println(""+s.getStudent());
    }
}