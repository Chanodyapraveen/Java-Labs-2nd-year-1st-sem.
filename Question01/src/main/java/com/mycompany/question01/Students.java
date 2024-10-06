package com.mycompany.question01;
public class Students extends Person 
{
 double grade;
 
 Students(String name,int age, double grade)
 {
     super (name ,age);
     this.grade=grade;
 }
 
 void displayStudents()
 {
     System.out.println("Student Grade is"+grade);
 }
}
