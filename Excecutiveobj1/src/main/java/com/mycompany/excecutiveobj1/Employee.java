/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excecutiveobj1;
public class Employee 

{
 // data
    private int empNo;
    private String empName;
    private float  bs;
    
    public void setData(int en, String ename,float b)
    {
        empNo=en;
        empName= ename;
        bs=b;
    }
    public void display()
    {
    System.out.println("Employee No"+empNo);
    System.out.println("Employee Name"+empName);
    System.out.println("Basic salary"+bs);
    }
}
