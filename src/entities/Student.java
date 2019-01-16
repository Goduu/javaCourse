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
public class Student {

    public String name;
    public double notaTm1;
    public double notaTm2;
    public double notaTm3;

    public double finalGrade() {
        return notaTm1 + notaTm2 + notaTm3;
    }

    public void result() {
        double finalGrade = finalGrade();
        System.out.printf("FINAL GRADE = %.2f", finalGrade);
        System.out.println();
        if (finalGrade > 60) {
            System.out.printf("PASS");
            System.out.println();
        } else {
            System.out.printf("FAILED %nMISSING %.2f Points", 60 - finalGrade);
            System.out.println();

        }
        
    }

}
