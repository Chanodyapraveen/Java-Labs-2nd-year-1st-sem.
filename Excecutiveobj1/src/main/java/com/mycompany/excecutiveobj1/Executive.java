/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excecutiveobj1;
public class Executive extends Employee
{
     private float allowance;
     public void SetAllowance (float a)
     {
     allowance=a;
     }
     public void dispalyAllowance()
     {
         System.out.println("Allowance is"+allowance);
     }
}
