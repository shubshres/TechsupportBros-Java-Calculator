import com.Calculator.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {


    // -------------------- checkNumberType METHOD -------------------------- //

    // TEST 1: checkNumberType
    // INPUT: {5}
    // EXPECTED OUTPUT: "The number 5.0 is a natural number"
    @Test
    void test1(){
        double[] num = {5};
        calculator c = new calculator();
        assertEquals("The number 5.0 is a natural number", c.checkNumberType(num));
    }

    // TEST 2: checkNumberType
    // INPUT: {0}
    // EXPECTED OUTPUT: "The number 0.0 is a whole number, but NOT an integer"
    @Test
    void test2(){
        double[] num = {0};
        calculator c = new calculator();
        assertEquals("The number 0.0 is a whole number, but NOT an integer", c.checkNumberType(num));
    }

    // TEST 3: checkNumberType
    // INPUT: {-5}
    // EXPECTED OUTPUT:
    @Test
    void test3(){
        double[] num = {-5};
        calculator c = new calculator();
        assertEquals("The number -5.0 is an integer", c.checkNumberType(num));
    }

    // TEST 4: checkNumberType
    // INPUT: {9.5}
    // EXPECTED OUTPUT: "The number 9.5 is rational"
    @Test
    void test4(){
        double[] num = {9.5};
        calculator c = new calculator();
        assertEquals("The number 9.5 is rational", c.checkNumberType(num));
    }


    // -------------------- checkRightTriangle METHOD -------------------------- //



    // TEST 5: checkRightTriangle
    // INPUT: {3,4,-5}
    // EXPECTED OUTPUT: "Invalid input - Sides must have a length greater than 0"
    @Test
    void test5(){
        double[] sides = {3,4,-5};
        calculator c = new calculator();
        assertEquals("Invalid input - Sides must have a length greater than 0", c.checkRightTriangle(sides));
    }

    // TEST 6: checkRightTriangle
    // INPUT: {3,4,5}
    // EXPECTED OUTPUT: "Right triangle - Third side is hypotenuse"
    @Test
    void test6(){
        double[] sides = {3,4,5};
        calculator c = new calculator();
        assertEquals("Right triangle - Third side is hypotenuse", c.checkRightTriangle(sides));
    }

    // TEST 7: checkRightTriangle
    // INPUT: {3,5,4}
    // EXPECTED OUTPUT: "Right triangle - Second side is hypotenuse"
    @Test
    void test7(){
        double[] sides = {3,5,4};
        calculator c = new calculator();
        assertEquals("Right triangle - Second side is hypotenuse", c.checkRightTriangle(sides));
    }

    // TEST 8: checkRightTriangle
    // INPUT: {5,3,4}
    // EXPECTED OUTPUT: "Right triangle - First side is hypotenuse"
    @Test
    void test8(){
        double[] sides = {5,3,4};
        calculator c = new calculator();
        assertEquals("Right triangle - First side is hypotenuse", c.checkRightTriangle(sides));
    }



    // TEST 9: checkRightTriangle
    // INPUT: {1,1,1}
    // EXPECTED OUTPUT: "This is NOT a right triangle"
    @Test
    void test9(){
        double[] sides = {1,1,1};
        calculator c = new calculator();
        assertEquals("This is NOT a right triangle", c.checkRightTriangle(sides));
    }




// -------------------- checkMultiples METHOD --------- COUNT VARIABLE ----------------- //

    // TEST 10: checkMultiples
    // INPUT: {0}
    // EXPECTED OUTPUT: “0.0 is a multiple of: ”
    @Test
    void test10(){
        double[] num = {0};
        calculator c = new calculator();
        assertEquals("0.0 is a multiple of: ", c.checkMultiples(num));
    }

    // TEST 11: checkMultiples
    // INPUT: {2}
    // EXPECTED OUTPUT: "2.0 is a multiple of:  1  2"
    @Test
    void test11(){
        double[] num = {2};
        calculator c = new calculator();
        assertEquals("2.0 is a multiple of:  1  2 ", c.checkMultiples(num));
    }



    // TEST 12: checkMultiples
    // INPUT: {3}
    // EXPECTED OUTPUT: "3.0 is a multiple of:  1  3 "
    @Test
    void test12(){
        double[] num = {3};
        calculator c = new calculator();
        assertEquals("3.0 is a multiple of:  1  3 ", c.checkMultiples(num));
    }



    // TEST 13: checkMultiples
    // INPUT: {4}
    // EXPECTED OUTPUT: "4.0 is a multiple of:  1  2  4 "
    @Test
    void test13(){
        double[] num = {4};
        calculator c = new calculator();
        assertEquals("4.0 is a multiple of:  1  2  4 ", c.checkMultiples(num));
    }

    // TEST 14: checkMultiples
    // INPUT: {5}
    // EXPECTED OUTPUT: "5.0 is a multiple of:  1  5 "
    @Test
    void test14(){
        double[] num = {5};
        calculator c = new calculator();
        assertEquals("5.0 is a multiple of:  1  5 ", c.checkMultiples(num));
    }


    // TEST 15: checkMultiples
    // INPUT: {6}
    // EXPECTED OUTPUT: "6.0 is a multiple of:  1  2  3  6 "
    @Test
    void test15(){
        double[] num = {6};
        calculator c = new calculator();
        assertEquals("6.0 is a multiple of:  1  2  3  6 ", c.checkMultiples(num));

    }


    // -------------------- checkMultiples METHOD --------- NUM VARIABLE ----------------- //

    // TEST 16: checkMultiples
    // INPUT: {-1}
    // EXPECTED OUTPUT: "-1.0 is a multiple of: "
    @Test
    void test16(){
        double[] num = {-1};
        calculator c = new calculator();
        assertEquals("-1.0 is a multiple of: ", c.checkMultiples(num));
    }



    // TEST 17: checkMultiples
    // INPUT: {7}
    // EXPECTED OUTPUT: "7.0 is a multiple of:  1  7 "
    @Test
    void test17(){
        double[] num = {7};
        calculator c = new calculator();
        assertEquals("7.0 is a multiple of:  1  7 ", c.checkMultiples(num));
    }

    // TEST 18: checkMultiples
    // INPUT: {13}
    // EXPECTED OUTPUT: "13.0 is a multiple of:  1  13 "
    @Test
    void test18(){
        double[] num = {13};
        calculator c = new calculator();
        assertEquals("13.0 is a multiple of:  1  13 ", c.checkMultiples(num));
    }


    // -------------------- checkMultiples METHOD --------- OUTPUT VARIABLE ----------------- //

    // TEST 19: checkMultiples
    // INPUT: {14}
    // EXPECTED OUTPUT: "14.0 is a multiple of:  1  2  7  14 "
    @Test
    void test19(){
        double[] num = {14};
        calculator c = new calculator();
        assertEquals("14.0 is a multiple of:  1  2  7  14 ", c.checkMultiples(num));
    }

    // TEST 20: checkMultiples
    // INPUT: {8}
    // EXPECTED OUTPUT: "8.0 is a multiple of:  1  2  4  8 "
    @Test
    void test20(){
        double[] num = {8};
        calculator c = new calculator();
        assertEquals("8.0 is a multiple of:  1  2  4  8 ", c.checkMultiples(num));
    }


    // TEST 21: checkMultiples
    // INPUT: {9}
    // EXPECTED OUTPUT: ":9.0 is a multiple of:  1  3  9 "
    @Test
    void test21(){
        double[] num = {9};
        calculator c = new calculator();
        assertEquals("9.0 is a multiple of:  1  3  9 ", c.checkMultiples(num));
    }

    // TEST 22: checkMultiples
    // INPUT: {10}
    // EXPECTED OUTPUT: "10.0 is a multiple of:  1  2  5  10 "
    @Test
    void test22(){
        double[] num = {10};
        calculator c = new calculator();
        assertEquals("10.0 is a multiple of:  1  2  5  10 ", c.checkMultiples(num));
    }



    // -------------------- checkMultiples METHOD --------- MULTIPLE VALUES VARIABLE ----------------- //



    // TEST 23: checkMultiples
    // INPUT: {12}
    // EXPECTED OUTPUT: "12.0 is a multiple of:  1  2  3  4  6  12 "
    @Test
    void test23(){
        double[] num = {12};
        calculator c = new calculator();
        assertEquals("12.0 is a multiple of:  1  2  3  4  6  12 ", c.checkMultiples(num));
    }

    // TEST 24: checkMultiples
    // INPUT: {15}
    // EXPECTED OUTPUT: "15.0 is a multiple of:  1  3  5  15 "
    @Test
    void test24(){
        double[] num = {15};
        calculator c = new calculator();
        assertEquals("15.0 is a multiple of:  1  3  5  15 ", c.checkMultiples(num));
    }


    // TEST 25: checkMultiples
    // INPUT: {16}
    // EXPECTED OUTPUT:"16.0 is a multiple of:  1  2  4  8  16 "
    @Test
    void test25(){
        double[] num = {16};
        calculator c = new calculator();
        assertEquals("16.0 is a multiple of:  1  2  4  8  16 ", c.checkMultiples(num));
    }


    // -------------------- romanNumerals METHOD ---------  VALUES VARIABLE ----------------- //

    // TEST 26: romanNumerals
    // INPUT: 1
    // EXPECTED OUTPUT: "The integer 1.0 in Roman Numerals is: I"
    @Test
    void test26(){
        double num = 1;
        calculator c = new calculator();
        assertEquals("The integer 1.0 in Roman Numerals is: I", c.romanNumerals(num));
    }


    // TEST 27: romanNumerals
    // INPUT: 2
    // EXPECTED OUTPUT: "The integer 2.0 in Roman Numerals is: II"
    @Test
    void test27(){
        double num = 2;
        calculator c = new calculator();
        assertEquals("The integer 2.0 in Roman Numerals is: II", c.romanNumerals(num));
    }


    // TEST 28: romanNumerals
    // INPUT: 3
    // EXPECTED OUTPUT: "The integer 3.0 in Roman Numerals is: III"
    @Test
    void test28(){
        double num = 3;
        calculator c = new calculator();
        assertEquals("The integer 3.0 in Roman Numerals is: III", c.romanNumerals(num));

    }


    // -------------------- romanNumerals METHOD ---------  originalNum VARIABLE ----------------- //

    // TEST 29: romanNumerals
    // INPUT: 4
    // EXPECTED OUTPUT: "The integer 4.0 in Roman Numerals is: IV"
    @Test
    void test29(){
        double num = 4;
        calculator c = new calculator();
        assertEquals("The integer 4.0 in Roman Numerals is: IV", c.romanNumerals(num));
    }




    // -------------------- romanNumerals METHOD ---------  romanLetters VARIABLE ----------------- //

    // TEST 30: romanNumerals
    // INPUT: 7
    // EXPECTED OUTPUT: "The integer 7.0 in Roman Numerals is: VII"
    @Test
    void test30(){
        double num = 7;
        calculator c = new calculator();
        assertEquals("The integer 7.0 in Roman Numerals is: VII", c.romanNumerals(num));
    }


    // -------------------- romanNumerals METHOD ---------  roman VARIABLE ----------------- //

    // TEST 31: romanNumerals
    // INPUT: 10
    // EXPECTED OUTPUT: "The integer 10 in Roman Numerals is: X"
    @Test
    void test31(){
        double num = 10;
        calculator c = new calculator();
        assertEquals("The integer 10.0 in Roman Numerals is: X", c.romanNumerals(num));
    }


    // TEST 32: romanNumerals
    // INPUT: 11
    // EXPECTED OUTPUT: "The integer 10 in Roman Numerals is: XI"
    @Test
    void test32(){
        double num = 11;
        calculator c = new calculator();
        assertEquals("The integer 11.0 in Roman Numerals is: XI", c.romanNumerals(num));
    }



    // -------------------- numberInfo METHOD ------------------------------ //

    // TEST 33: numberInfo
    // INPUT: 2
    // EXPECTED OUTPUT: "This number is single digit, positive, and even number"
    @Test
    void test33(){
        double[] num = {2};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(num));
    }

    // TEST 34: numberInfo
    // INPUT: 44
    // EXPECTED OUTPUT: "This number is a 2 digit, positive, and even number"
    @Test
    void test34(){
        double[] num = {44};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and even number", c.numberInfo(num));
    }


    // TEST 35: numberInfo
    // INPUT: -2
    // EXPECTED OUTPUT: "This number is a single digit, negative, and even number"
    @Test
    void test35(){
        double[] num = {-2};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and even number", c.numberInfo(num));
    }

    // TEST 36: numberInfo
    // INPUT: -44
    // EXPECTED OUTPUT: "This number is a 2 digit, negative, and even number"

    @Test
    void test36(){
        double[] num = {-44};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, negative, and even number", c.numberInfo(num));
    }

    // TEST 37: numberInfo
    // INPUT: 1
    // EXPECTED OUTPUT: "This number is a single digit, positive, and odd number"
    @Test
    void test37(){
        double[] num = {1};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(num));
    }

    // TEST 38: numberInfo
    // INPUT: 13
    // EXPECTED OUTPUT: "This number is a 2 digit, positive, and odd number"
    @Test
    void test38(){
        double[] num = {13};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(num));
    }

    // TEST 39: numberInfo
    // INPUT: -1
    // EXPECTED OUTPUT: "This number is a single digit, negative, and odd number"
    @Test
    void test39(){
        double[] num = {-1};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and odd number", c.numberInfo(num));
    }

    // TEST 40: numberInfo
    // INPUT: -13
    // EXPECTED OUTPUT: "This number is a 2 digit, negative, and odd number"
    @Test
    void test40(){
        double[] num = {-13};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, negative, and odd number", c.numberInfo(num));
    }

    // TEST 41: numberInfo
    // INPUT: 0
    // EXPECTED OUTPUT: "This number is not negative or positive"
    @Test
    void test41(){
        double[] num = {0};
        calculator c = new calculator();
        assertEquals("This number is not negative or positive", c.numberInfo(num));
    }





}
