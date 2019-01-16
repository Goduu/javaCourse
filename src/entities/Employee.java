/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author idcan
 */
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
        //System.out.printf("Employee: %s, $ %f", name, grossSalary - tax);
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary *= (percentage + 100)/100;
        
    }
   
    
}
