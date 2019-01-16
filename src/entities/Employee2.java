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
public class Employee2 {

    public Employee2(int id, String Name, double Salary) {
        this.id = id;
        this.Name = Name;
        this.Salary = Salary;
    }
    
    
    private int id;
    private String Name;
    private double Salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public Employee2(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }
    
    public void increaseSalary(double percent){
       this.setSalary(this.getSalary()*(100+percent)/100);
    }

   
    
    
}
