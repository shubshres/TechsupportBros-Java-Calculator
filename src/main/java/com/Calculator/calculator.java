package com.Calculator;

import java.util.Scanner;

public class calculator {
    public static double add (double a, double b){
        return (a + b);
    }

    public static double multiply (double a, double b){
        return (a * b);
    }

    public static double divide (double a, double b){
        return (a / b);
    }

    public static double subtract (double a, double b){
        return (a - b);
    }

    public static String doOperation(String option, double a, double b){
        option = option.toLowerCase();
        double answer;
        switch (option){
            case("add"):
                answer = add(a,b);
                return(a + " + " + b + " = " + answer);
            case("multiply"):
                answer = multiply(a,b);
                return(a + " * " + b + " = " + answer);
            case("divide"):
                answer = divide(a,b);
                return(a + " / " + b + " = " + answer);
            case("subtract"):
                answer = subtract(a,b);
                return(a + " - " + b + " = " + answer);
            default:
                return("INVALID OPERATION");
        }
    }
    public static void main(String args[]){
        Scanner operation = new Scanner(System.in);
        System.out.println("PLEASE ENTER WHAT OPERATION YOU WOULD LIKE TO DO: ");
        System.out.println("Options: ");
        System.out.println("\tadd\n\tsubtract\n\tmultiply\n\tdivide ");
        String option = operation.next();

        Scanner x = new Scanner(System.in);
        System.out.println("Enter in a number: ");
        double a = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.println("Enter in another number: ");
        double b = y.nextDouble();

        String answer = doOperation(option, a, b);

        System.out.println(answer);
    }

}
