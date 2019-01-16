/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import entities.Bank;
import entities.CurrencyConverter;
import entities.Employee;
import entities.Employee2;
import entities.Room;
import entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author idcan
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Exercicio 1
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.printf("Products:%n %s, wich price is $%.2f %n %s, wich price is $%.2f %n %n Record: %d years old, code %d and gender: %c %n %n Measures with eight decimal places: %.8f %n Rounded(three decimal places): %.3f %n", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
         */
 /*Exercício 2
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name = sc.nextLine();
        System.out.println("How many bedrooms are there in your house?");
        int bedrooms = sc.nextInt();
        System.out.println("Enter product price:");
        double productPrice = sc.nextDouble();
        System.out.println("Enter your last name, age and height (same line):");
        String lastName = sc.next();
        int age = sc.nextInt();
        double height= sc.nextDouble();
        
        System.out.println(name);
        System.out.println(bedrooms);
        System.out.println(productPrice);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(height);
        sc.close();
         */
        //Exercicio 3
        /*
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if( (a > b && a > c) || (a > b && a == c) || (a > c && a == b))
            System.out.println(a);
        else if ((b > a && b > c) || (b > a && b == c )|| (b > c && b == a) )
            System.out.println(b);
        else if(c > a && c > b)
            System.out.println(c);
        else System.out.println(a);
         *///Exercício 4
        /*
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter N:");
        int numero = sc.nextInt();
        int maior = Integer.MIN_VALUE;

        while (numero <= 0) {
            System.out.printf("Number must be positive! Try again: %d", numero);
            numero = sc.nextInt();
        }
        for (int i = 0; i < numero; i++) {
            System.out.printf("Value #%d", i);
            int next = sc.nextInt();
            if (maior < next) {
                maior = next;

            }

        }
        System.out.printf("Higher = %d", maior);
         */
        //Exec[icio Slaraio funcionario 
        /*

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();
        System.out.print("Name: ");
        empregado.name = sc.nextLine();
        System.out.print("Gross salary: ");
        empregado.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %f", empregado.name, empregado.netSalary());
        System.out.println();
        System.out.print("Wich percentage to increase salary? ");
        empregado.increaseSalary(sc.nextDouble());
        System.out.println();
        System.out.printf("Updated data: %s, $ %f", empregado.name, empregado.netSalary());
        System.out.println();
         */
        //Exercício Aluno trimestre
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        Student aluno = new Student();
        aluno.name = sc.nextLine();
        aluno.notaTm1 = sc.nextDouble();
        aluno.notaTm2 = sc.nextDouble();
        aluno.notaTm3 = sc.nextDouble();
        
        aluno.result();
        sc.close();
         */

        //exercicio conversão dolar
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarValue = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f ",CurrencyConverter.converted(dollarBought) );
        System.out.println();
         */
        //exercicio banco
        /*
        System.out.print("Enter account number: ");
        int accNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter account holder: ");
        String accHolder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)?: ");
        Bank acc = new Bank(accNumber, accHolder);
        if ("y".equals(sc.nextLine())) {
            System.out.print("Enter initial depoist value: ");
            acc.setValue(Double.parseDouble(sc.nextLine()));
        }
        String action = "q";
        OUTER:

        System.out.println("What do you want to do? ");
        System.out.printf("-Deposit (d) %n-Withdraw (w)%n-Exit (e) %n");
        action = sc.nextLine();
        System.out.print(action);
        if (null != action) {
            switch (action) {
                case "d":
                    System.out.println("Enter a deposit value: ");
                    acc.deposit(sc.nextDouble());
                    System.out.println("Updated account data: ");
                    System.out.printf("Account %d, Holder: %s, Balance: $%.2f %n", acc.getAccNumber(), acc.getHolderName(), acc.getValue());
                    break;
                case "w":
                    System.out.println("Enter a withdraw value: ");
                    acc.withdraw(sc.nextDouble());
                    System.out.println("Updated account data: ");
                    System.out.printf("Account %d, Holder: %s, Balance: $%.2f %n", acc.getAccNumber(), acc.getHolderName(), acc.getValue());
                    break;
                case "e":
                    break;
                default:
                    break;
            }
        }
         */
//exercicio alocação de quartos
/*
        System.out.println("How many wooms will be rented?");
        int numRooms = sc.nextInt();
        sc.nextLine();
        Room[] hotelInn = new Room[numRooms];
        for (int i = 0; i < hotelInn.length; i++) {
            System.out.printf("Rent #%d:%n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            hotelInn[i] = new Room(name, email, room);
        }
        System.out.printf("Busy Rooms: %n");
        for (int i = 0; i < hotelInn.length; i++) {
            System.out.println(hotelInn[i]);

        }
         */
//Exercicio Lista
        System.out.print("How many empoyees will be registered? ");
        int regSize = sc.nextInt();
        sc.nextLine();
        //Employee2[] registers = new Employee2[regSize];
        List<Employee2> registers;
        registers = new ArrayList<>();

        for (int i = 0; i < regSize; i++) {

            System.out.printf("Employee #%d%n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee2 emp = new Employee2(id, name, salary);
            registers.add(emp);
        }

        System.out.printf("Enter the employee id taht will have a salary increase: ");
        int idForRaise = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter the percentage: ");
        double raisePercentage = sc.nextDouble();
        System.out.print(idForRaise);
        for(int i = 0; i < regSize; i++){
            
            if(registers.get(i).getId() == idForRaise)
                registers.get(i).increaseSalary(raisePercentage);
            
        }
        
        System.out.printf("%nList of employees:%n");
        registers.forEach((employee) -> {
            System.out.printf("%d, %s, %.2f%n", employee.getId(), employee.getName(), employee.getSalary());
        }
        );

    }

}
