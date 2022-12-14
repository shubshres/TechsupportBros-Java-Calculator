package com.Calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList; // import the ArrayList class


public class calculator {

    // ----------------------- ADD METHOD FUNCTIONS ------------------------------
    public static double add(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return (total);
    }

    public static double addMutant1(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total -= numbers[i];
        }

        return (total);
    }

    public static double addMutant2(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total *= numbers[i];
        }

        return (total);
    }

    public static double addMutant3(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total /= numbers[i];
        }

        return (total);
    }


    public static double addMutant4(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i];
        }

        return (total);
    }

    public static double addMutant5(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total %= numbers[i];
        }

        return (total);
    }

    public static double addMutant6(double[] numbers) {
        double total = 0;

        for (int i = 0; i > numbers.length; i++) {
            total = numbers[i];
        }

        return (total);
    }


    // --------------------- MULTIPLY METHOD FUNCTIONS --------------------------

    public static double multiply(double[] numbers) {
        double total = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] * total;
        }

        return (total);
    }

    public static double multiplyMutant1(double[] numbers) {
        double total = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] + total;
        }

        return (total);
    }

    public static double multiplyMutant2(double[] numbers) {
        double total = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] - total;
        }

        return (total);
    }

    public static double multiplyMutant3(double[] numbers) {
        double total = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] / total;
        }

        return (total);
    }

    public static double multiplyMutant4(double[] numbers) {
        double total = 1;

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] % total;
        }

        return (total);
    }

    public static double multiplyMutant5(double[] numbers) {
        double total = 1;

        for (int i = 0; i > numbers.length; i++) {
            total = numbers[i] * total;
        }

        return (total);
    }


    // ------------------ DIVIDE METHOD FUNCTIONS ------------------------------------


    public static double divide(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = total / numbers[i];
        }

        return (total);
    }


    public static double divideMutant1(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i > numbers.length; i++) {
            total = total / numbers[i];
        }

        return (total);
    }

    public static double divideMutant2(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = total * numbers[i];
        }

        return (total);
    }

    public static double divideMutant3(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        return (total);
    }

    public static double divideMutant4(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = total - numbers[i];
        }

        return (total);
    }

    public static double divideMutant5(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = total % numbers[i];
        }

        return (total);
    }




    // ------------------ SUBTRACT METHOD FUNCTIONS ------------------------------------


    public static double subtract(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total -= numbers[i];
        }

        return (total);
    }

    public static double subtractMutant1(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total += numbers[i];
        }

        return (total);
    }

    public static double subtractMutant2(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total = numbers[i];
        }

        return (total);
    }

    public static double subtractMutant3(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total *= numbers[i];
        }

        return (total);
    }

    public static double subtractMutant4(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total /= numbers[i];
        }

        return (total);
    }

    public static double subtractMutant5(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total %= numbers[i];
        }

        return (total);
    }

    public static double subtractMutant6(double[] numbers) {
        double total = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            total -= numbers[i];
        }

        return (total);
    }

    public static double subtractMutant7(double[] numbers) {
        double total = numbers[0];

        for (int i = 1; i > numbers.length; i++) {
            total -= numbers[i];
        }

        return (total);
    }


    public static double subtractMutant8(double[] numbers) {
        double total = numbers[1];

        for (int i = 1; i < numbers.length; i++) {
            total -= i;
        }

        return (total);
    }




    // ------------------ MEAN FUNCTIONS ------------------------------------

    public static double mean(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }

    public static double meanMutant1(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double mean = total + numbers.length;

        return (mean);
    }

    public static double meanMutant2(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double mean = total - numbers.length;

        return (mean);
    }

    public static double meanMutant3(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double mean = total * numbers.length;

        return (mean);
    }

    public static double meanMutant4(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double mean = total % numbers.length;

        return (mean);
    }

    public static double meanMutant5(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total -= numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }

    public static double meanMutant6(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total *= numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }

    public static double meanMutant7(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total /= numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }

    public static double meanMutant8(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total %= numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }

    public static double meanMutant9(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i];
        }
        double mean = total / numbers.length;

        return (mean);
    }



    // ------------------ MEDIAN FUNCTIONS ------------------------------------

    public static double median(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize % 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }


    public static double medianMutant1(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize * 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }


    public static double medianMutant2(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize / 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant3(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize + 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant4(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize - 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant5(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize % 2 == 0) {
            int middle = numbers.length - 2;
            double median = (numbers[(middle)] + numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant6(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize % 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] * numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant7(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize % 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] - numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }

    public static double medianMutant8(double[] numbers) {
        Arrays.sort(numbers);

        double arraySize = numbers.length;

        if (arraySize % 2 == 0) {
            int middle = numbers.length / 2;
            double median = (numbers[(middle)] / numbers[(middle - 1)]) / 2;
            return (median);
        } else {
            double middle = (numbers.length / 2);
            double middleCeil = Math.ceil(middle);
            int median = (int) numbers[(int) middleCeil];
            return (median);
        }
    }


    // ----------------------------------------------------------------------

    public static double mode(double[] numbers) {
        double max = Arrays.stream(numbers).max().getAsDouble();

        int t = (int) (max + 1);

        double[] count = new double[t];

        for (int i = 0; i < t; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            count[(int) numbers[i]]++;
        }

        int mode = 0;

        double k = count[0];

        for (int i = 1; i < t; i++) {
            if (count[i] > k) {
                k = count[i];
                mode = i;
            }
        }

        return mode;
    }

    public static double range(double[] numbers) {
        Arrays.sort(numbers);
        return (numbers[numbers.length - 1] - numbers[0]);
    }

    public static double standardDeviation(double[] numbers) {
        double sum = 0;
        double standardDeviation = 0;

        int length = numbers.length;

        for (double num : numbers) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }

    public static double percentage(double[] numbers) {
        double percentage = numbers[0] / 100;
        double number = numbers[1];
        return (percentage * number);
    }

    public static double exponent(double[] numbers) {
        double exponentValue;
        exponentValue = Math.pow(numbers[0], numbers[1]);
        return (exponentValue);
    }

    public static double pythagorean(double[] numbers) {
        double a = Math.pow(numbers[0], 2);
        double b = Math.pow(numbers[1], 2);
        double c = Math.sqrt(a + b);
        return c;
    }

    public static double root(double[] numbers) {
        double root = Math.pow((numbers[1]), 1 / numbers[0]);
        return root;
    }

    public static double modulos(double[] numbers) {
        double mod = (numbers[0] % numbers[1]);
        return mod;
    }

    public static double degreesToRadians(double[] numbers) {
        double degreesToRadians = Math.toRadians((numbers[0]));
        return degreesToRadians;
    }

    public static String checkRightTriangle(double[] numbers) {
        double a = numbers[0];
        double b = numbers[1];
        double c = numbers[2];


        // Check if all sides are greater than 0
        if (a > 0 && b > 0 && c > 0) {

            // Check if C is hypotenuse
            if (a * a + b * b == c * c) {
                return ("Right triangle - Third side is hypotenuse");
            }

            // Check if B is hypotenuse
            if (a * a + c * c == b * b) {
                return ("Right triangle - Second side is hypotenuse");
            }

            // Check if A is hypotenuse
            if (b * b + c * c == a * a) {
                return ("Right triangle - First side is hypotenuse");
            }

            return ("This is NOT a right triangle");


        } else if (a < 0 || b < 0 || c < 0){

            return ("Invalid Input");
        }
        else{

            return("");
        }

    }

    public static String checkNumberType(double[] numbers) {

        double num = numbers[0];

        //Check if the number is whole number (integer)
        if (num % 1 == 0) {

            //Check if number is positive (natural number)
            if (num > 0) {

                return ("The number " + num + " is a natural number");

            }
            // check if number is zero
            else if (num == 0) {
                return ("The number " + num + " is a whole number, but NOT an integer");
            }
            // check if number is negative, if it is negative it is an integer
            else {
                return ("The number " + num + " is an integer");
            }

        }
        // if number has decimal points, then it is rational
        else {
            return ("The number " + num + " is rational");
        }


    }


    public static String checkMultiples(double[] numbers) {


        double num = numbers[0];
        String output = "";
        ArrayList<Integer> multipleValues = new ArrayList<Integer>();


        int count = 1;  //def

        while (count <= num) {   //use


            if (num % count == 0) { //use

                multipleValues.add(count);  //use

            }

            count++;    //def

        }

//      //Output
        output = num + " is a multiple of: ";

        // Iterating using for loop
        for (int i = 0; i < multipleValues.size(); i++) {

            // Printing and display the elements in ArrayList
            output = output + " " + Integer.toString(multipleValues.get(i)) + " ";


        }


        return output;


    }


    public static String romanNumerals(double num) {

        String result = "";
        double originalNum = num;
        double[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }

        result = "The integer " + originalNum + " in Roman Numerals is: " + roman.toString();

        return (result);

    }


    public static String numberInfo(double[] numbers) {

        // This function returns info about the function

        double num = numbers[0];
        int lengthOfInt = 0;
        lengthOfInt = String.valueOf((  (int)num) ).length();

        if(num < 0)
        {
            lengthOfInt = lengthOfInt - 1;
        }


        //refactoring the code

        if( (num > 0) && (num % 2 == 0) && (lengthOfInt == 1) ){

            return ("This number is a single digit, positive, and even number");

        } else if( (num > 0) && (num % 2 == 0) && (lengthOfInt > 1) ){

            return ("This number is a " + lengthOfInt + " digit, positive, and even number");

        } else if( (num > 0) && (num % 2 != 0) && (lengthOfInt == 1) ){

            return ("This number is a single digit, positive, and odd number");

        } else if( (num > 0) && (num % 2 != 0) && (lengthOfInt > 1) ){

            return ("This number is a " + lengthOfInt + " digit, positive, and odd number");

        } else if( (num < 0) && (num % 2 == 0) && (lengthOfInt == 1) ){

            return ("This number is a single digit, negative, and even number");

        } else if( (num < 0) && (num % 2 == 0) && (lengthOfInt > 1) ){

            return ("This number is a " + lengthOfInt + " digit, negative, and even number");

        } else if( (num < 0) && (num % 2 != 0) && (lengthOfInt == 1) ){

            return ("This number is a single digit, negative, and odd number");

        } else if( (num < 0) && (num % 2 != 0) && (lengthOfInt > 1) ){

            return ("This number is a " + lengthOfInt + " digit, negative, and odd number");

        } else if (num == 0){

            return ("This number is not positive or negative");

        }
        else{

            return ("Could not be determined");
        }







    }


    public static String doOperation(String option, double[] numbers) {
        option = option.toLowerCase();
        double answer;
        String result;
        switch (option) {
            case ("add"):
                answer = add(numbers);
                return ("=" + answer);
            case ("multiply"):
                answer = multiply(numbers);
                return ("=" + answer);
            case ("divide"):
                answer = divide(numbers);
                return ("=" + answer);
            case ("subtract"):
                answer = subtract(numbers);
                return ("=" + answer);
            case ("mean"):
                answer = mean(numbers);
                return ("=" + answer);
            case ("median"):
                answer = median(numbers);
                return ("=" + answer);
            case ("mode"):
                answer = mode(numbers);
                return ("=" + answer);
            case ("range"):
                answer = range(numbers);
                return ("=" + answer);
            case ("standard deviation"):
                answer = standardDeviation(numbers);
                return ("=" + answer);
            case ("percentage"):
                answer = percentage(numbers);
                return ("=" + answer);
            case ("exponent"):
                answer = exponent(numbers);
                return ("=" + answer);
            case ("pythagorean"):
                answer = pythagorean(numbers);
                return ("=" + answer);
            case ("root"):
                answer = root(numbers);
                return ("=" + answer);
            case ("modulos"):
                answer = modulos(numbers);
                return ("=" + answer);
            case ("degrees to radians"):
                answer = degreesToRadians(numbers);
                return ("=" + answer);
            case ("check right triangle"):
                return (checkRightTriangle(numbers));
            case ("check number type"):
                return (checkNumberType(numbers));
            case ("check multiples"):
                return (checkMultiples(numbers));
            case ("roman numerals"):
                return (romanNumerals(numbers[0]));
            case ("number info"):
                return (numberInfo(numbers));
            default:
                return ("error");

        }
    }

    public static void main(String args[]) {
        // initializing variables
        int amountOfNumbers = 0;

        Scanner operation = new Scanner(System.in);
        System.out.println("PLEASE ENTER WHAT OPERATION YOU WOULD LIKE TO DO: ");
        System.out.println("Type \"help\" to see options");
        String option = operation.nextLine();

        option.toLowerCase();
        if (option.equals("help")) {
            do {
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
                // New methods
                System.out.println("\n\tcheck right triangle:\n\t\tThis will you allow you to check if three sides make up a right triangle ");
                System.out.println("\n\tcheck number type:\n\t\tThis function checks if a number is a rational, whole, natural, or an integer ");
                System.out.println("\n\tcheck multiples:\n\t\tThis function returns all the numbers the input is a multiple of ");
                System.out.println("\n\troman numerals:\n\t\tThis function converts a number to roman numerals");
                System.out.println("\n\tnumber info:\n\t\tThis function displays information about a given number");


                System.out.println("PLEASE ENTER WHAT OPERATION YOU WOULD LIKE TO DO: ");
                System.out.println("Type \"help\" to see options");
                option = operation.next();
            } while (option.equals("help"));
        }

        Scanner numberOfNumbers = new Scanner(System.in);

        if (option.equals("degrees to radians") || option.equals("check number type") || option.equals("check multiples") || option.equals("roman numerals") || option.equals("number info")) {
            System.out.println("PLEASE ENTER A NUMBER: ");
            amountOfNumbers = 1;
        } else if (!(option.equals("exponent") || option.equals("pythagorean") || option.equals("percentage") ||
                option.equals("root") || option.equals("mod"))) {
            System.out.println("PLEASE ENTER HOW MANY NUMBERS YOU WOULD LIKE TO OPERATE ON: ");
            amountOfNumbers = numberOfNumbers.nextInt();
            System.out.println("ENTER YOUR ARRAY OF NUMBERS: ");
        } else {
            System.out.println("PLEASE ENTER TWO NUMBERS: ");
            amountOfNumbers = 2;
        }

        double[] numbers = new double[amountOfNumbers];

        Scanner list = new Scanner(System.in);
        for (int i = 0; i < amountOfNumbers; i++) {
            numbers[i] = list.nextDouble();
        }

        String answer = doOperation(option, numbers);

        System.out.println(answer);
    }

}
