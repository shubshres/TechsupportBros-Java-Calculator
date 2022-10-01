package com.Calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class calculator {
    public static double add (double[] numbers){
        double total = 0;

        for(int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }

        return (total);
    }

    public static double multiply (double[] numbers){
        double total = 1;

        for(int i = 0; i < numbers.length; i++){
            total = numbers[i] * total;
        }

        return (total);
    }

    public static double divide (double[] numbers){
        double total = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            total = total/numbers[i];
        }

        return (total);
    }

    public static double subtract (double[] numbers){
        double total = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            total -= numbers[i];
        }

        return (total);
    }

    public static double mean(double[] numbers){
        double total = 0;
        for(int i = 0; i < numbers.length; i++){
            total+=numbers[i];
        }
        double mean = total/numbers.length;

        return(mean);
    }

    public static double median(double[] numbers){
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if(arraySize%2 == 0){
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle-1)])/2;
            return (median);
        }
        else{
            double middle = (numbers.length/2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }
    public static double mode(double[] numbers){
        double max = Arrays.stream(numbers).max().getAsDouble();

        int t = (int) (max + 1);

        double[] count = new double[t];

        for (int i = 0; i < t; i++)
        {
            count[i] = 0;
        }

        for (int i = 0; i < numbers.length; i++)
        {
            count[(int) numbers[i]]++;
        }

        int mode = 0;

        double k = count[0];

        for (int i = 1; i < t; i++)
        {
            if (count[i] > k)
            {
                k = count[i];
                mode = i;
            }
        }

        return mode;
    }

    public static double range(double[] numbers){
        Arrays.sort(numbers);
        return (numbers[numbers.length-1] - numbers[0]);
    }

    public static double standardDeviation(double[] numbers){
        double sum = 0;
        double standardDeviation = 0;

        int length = numbers.length;

        for(double num : numbers) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public static double percentage(double[] numbers){
        double percentage = numbers[0] / 100;
        double number = numbers[1];
        return (percentage * number);
    }

    public static double exponent(double[] numbers){
        double exponentValue;
        exponentValue = Math.pow(numbers[0], numbers[1]);
        return(exponentValue);
    }

    public static double pythagorean(double[] numbers){
        double a = Math.pow(numbers[0], 2);
        double b = Math.pow(numbers[1], 2);
        double c = Math.sqrt(a+b);
        return c;
    }

    public static double root(double[] numbers){
        double root = Math.pow((numbers[1]), 1/numbers[0]);
        return root;
    }

    public static double modulos(double[] numbers){
        double mod = (numbers[0] % numbers[1]);
        return mod;
    }

    public static double degreesToRadians(double[] numbers){
        double degreesToRadians = Math.toRadians((numbers[0]));
        return degreesToRadians;
    }
    public static String doOperation(String option, double[] numbers ){
        option = option.toLowerCase();
        double answer;
        switch (option){
            case("add"):
                answer = add(numbers);
                return("="+answer);
            case("multiply"):
                answer = multiply(numbers);
                return("="+answer);
            case("divide"):
                answer = divide(numbers);
                return("="+answer);
            case("subtract"):
                answer = subtract(numbers);
                return("="+answer);
            case("mean"):
                answer = mean(numbers);
                return("="+answer);
            case("median"):
                answer = median(numbers);
                return("="+answer);
            case("mode"):
                answer = mode(numbers);
                return("="+answer);
            case("range"):
                answer = range(numbers);
                return("="+answer);
            case("standard deviation"):
                answer = standardDeviation(numbers);
                return("="+answer);
            case("percentage"):
                answer = percentage(numbers);
                return("="+answer);
            case("exponent"):
                answer = exponent(numbers);
                return("="+answer);
            case("pythagorean"):
                answer = pythagorean(numbers);
                return("="+answer);
            case("root"):
                answer = root(numbers);
                return("="+answer);
            case("modulos"):
                answer = modulos(numbers);
                return("="+answer);
            case("degrees to radians"):
                answer = degreesToRadians(numbers);
                return("="+answer);
            default:
                return ("error");

        }
    }
    public static void main(String args[]){
        // initializing variables
        int amountOfNumbers = 0;

        Scanner operation = new Scanner(System.in);
        System.out.println("PLEASE ENTER WHAT OPERATION YOU WOULD LIKE TO DO: ");
        System.out.println("Type \"help\" to see options");
        String option = operation.next();

        option.toLowerCase();
        if(option.equals("help")){
            do{
                System.out.println("PLEASE NOTE: INPUTS ARE UP TO 10 VALUES (for some cases)");
                System.out.println("\n\tadd:\n\t\tThis will allow you to add two or more numbers");
                System.out.println("\n\tsubtract:\n\t\tThis will allow you to subtract two or more numbers");
                System.out.println("\n\tmultiply:\n\t\tThis will allow you to multiply two or more numbers");
                System.out.println("\n\tdivide:\n\t\tThis will allow you to divide two or more numbers");
                System.out.println("\n\tmean:\n\t\tThis will you to find the mean in a list of numbers");
                System.out.println("\n\tmedian:\n\t\tThis will you to find the median in a list of numbers");
                System.out.println("\n\tmode:\n\t\tThis will you to find the mode in a list of numbers");
                System.out.println("\n\trange:\n\t\tThis will you to find the range in a list of numbers");
                System.out.println("\n\tstandard deviation:\n\t\tThis will you to find the standard deviation in a list of numbers");
                System.out.println("\n\tpercentage:\n\t\tThis will you to find the percent x of value y");
                System.out.println("\n\texponent:\n\t\tThis will you to find x (first input) ^ y (second input)");
                System.out.println("\n\tpythagorean:\n\t\tThis will you to find the pythagorean theorem using two numbers");
                System.out.println("\n\tmod:\n\t\tThis will you to find the modulos between two numbers");
                System.out.println("\n\troot:\n\t\tThis will you to nth-root using two numbers");
                System.out.println("\n\tdegrees to radians:\n\t\tThis will you to convert degrees to radians");
                System.out.println("PLEASE ENTER WHAT OPERATION YOU WOULD LIKE TO DO: ");
                System.out.println("Type \"help\" to see options");
                option = operation.next();
            }while(option.equals("help"));
        }

        Scanner numberOfNumbers = new Scanner(System.in);
        if(!(operation.equals("exponent") || operation.equals("pythagorean") || operation.equals("percentage") ||
                operation.equals("root") || operation.equals("mod"))){
            System.out.println("PLEASE ENTER HOW MANY NUMBERS YOU WOULD LIKE TO OPERATE ON (up to 10): ");
        }
        else if(operation.equals("degrees to radians")){
            System.out.println("PLEASE ENTER A NUMBER: ");
        }
        else{
            System.out.println("PLEASE ENTER TWO NUMBERS: ");
        }
        amountOfNumbers = numberOfNumbers.nextInt();

        double[] numbers = new double[amountOfNumbers];

        System.out.println("ENTER YOUR ARRAY OF NUMBERS: ");

        Scanner list = new Scanner(System.in);
        for(int i = 0; i < amountOfNumbers; i++){
            numbers[i]=list.nextDouble();
        }

        String answer = doOperation(option, numbers);

        System.out.println(answer);
    }

}
