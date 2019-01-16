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
public class CurrencyConverter {
    public static double dollarValue;
    public static double IOF = 0.06;
    
    public static double converted(double dollars){
        return dollarValue*dollars*(1+IOF);
    }
}
