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
public class Bank {
    private final int accNumber;
    private String holderName;
    private double value;

    public Bank(int accNumber, String holderName) {
        this.accNumber = accNumber;
        this.holderName = holderName;
    }

    public Bank(int accNumber, String holderName, double initialDeposit) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public void deposit(double value){
        this.value += value;
    }
    public void withdraw(double value){
        this.value -= value+5;
    }
    
}
