import com.Calculator.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {


    // -------------------- CheckRightTriangle() METHOD -------------------------- //

    // TEST 1: add()
    // INPUT: {1,2,3}
    // NORMAL OUTPUT: 6
    // MUTANT OUTPUT: -6
    @Test
    void test1() {
        double[] numbers = {1, 2, 3};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant1(numbers);

        assertFalse(normalOutput == mutantOutput);
    }


    // TEST 2: add()
    // INPUT: {1,2,0}
    // NORMAL OUTPUT: 3
    // MUTANT OUTPUT: 0
    @Test
    void test2() {

        double[] numbers = {1, 2, 0};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant2(numbers);

        assertFalse(normalOutput == mutantOutput);

    }

    // TEST 3: add()
    // INPUT: {3,2,1}
    // NORMAL OUTPUT: 6
    // MUTANT OUTPUT: 0
    @Test
    void test3() {

        double[] numbers = {3, 2, 1};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant3(numbers);

        // System.out.println(c.add(numbers));
        // System.out.println(c.addMutant3(numbers));

        assertFalse(normalOutput == mutantOutput);

    }


    @Test
    void test4() {
        
    }


    // TEST 5: checkRightTriangle
    // INPUT: {7,5,7}
    // EXPECTED OUTPUT: "This is NOT a right triangle"
    @Test
    void test5() {
        double[] sides = {7, 5, 7};
        calculator c = new calculator();
        assertEquals("This is NOT a right triangle", c.checkRightTriangle(sides));
    }

    // TEST 6: checkRightTriangle
    // INPUT: {2,-4,8}
    // EXPECTED OUTPUT: "Invalid Input"
    @Test
    void test6() {
        double[] sides = {2, -4, 8};
        calculator c = new calculator();
        assertEquals("Invalid Input", c.checkRightTriangle(sides));
    }

    // TEST 7: checkRightTriangle
    // INPUT: {-5,12,13}
    // EXPECTED OUTPUT: "Invalid Input"
    @Test
    void test7() {
        double[] sides = {-5, 12, 13};
        calculator c = new calculator();
        assertEquals("Invalid Input", c.checkRightTriangle(sides));
    }

    // TEST 8: checkRightTriangle
    // INPUT: {-7,7,7}
    // EXPECTED OUTPUT: "Invalid Input"
    @Test
    void test8() {
        double[] sides = {-7, 7, 7};
        calculator c = new calculator();
        assertEquals("Invalid Input", c.checkRightTriangle(sides));
    }


    // TEST 9: checkRightTriangle
    // INPUT: {5,-5,5}
    // EXPECTED OUTPUT: "Invalid Input"
    @Test
    void test9() {
        double[] sides = {5, -5, 5};
        calculator c = new calculator();
        assertEquals("Invalid Input", c.checkRightTriangle(sides));
    }



    // TEST 10

    @Test
    void test10() {
        double[] sides = {10, 6, 8};
        calculator c = new calculator();
        assertEquals("Right triangle - First side is hypotenuse", c.checkRightTriangle(sides));
    }

    // TEST 11

    @Test
    void test11() {
        double[] sides = {10, 6, -8};
        calculator c = new calculator();
        assertEquals("Invalid Input", c.checkRightTriangle(sides));
    }

    // TEST 12

    @Test
    void test12() {
        double[] sides = {9, 12, 15};
        calculator c = new calculator();
        assertEquals("Right triangle - Third side is hypotenuse", c.checkRightTriangle(sides));
    }





    // Predicate Table: 3

    // Row: 8
    @Test
    void test13() {
        double[] numbers = {2};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 4
    @Test
    void test14() {
        double[] numbers = {-2};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and even number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test15() {
        double[] numbers = {4};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 6
    @Test
    void test16() {
        double[] numbers = {1};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test17() {
        double[] numbers = {6};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 7
    @Test
    void test18() {
        double[] numbers = {282};
        calculator c = new calculator();
        assertEquals("This number is a 3 digit, positive, and even number", c.numberInfo(numbers));
    }

    // Predicate Table: 4

    // Row: 8
    @Test
    void test19() {
        double[] numbers = {33};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 4
    @Test
    void test20() {
        double[] numbers = {-23};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, negative, and odd number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test21() {
        double[] numbers = {37};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 6
    @Test
    void test22() {
        double[] numbers = {24};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test23() {
        double[] numbers = {87};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 7
    @Test
    void test24() {
        double[] numbers = {3};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }



    // Predicate Table: 5

    // Row: 8
    @Test
    void test25() {
        double[] numbers = {5};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 4
    @Test
    void test26() {
        double[] numbers = {-1};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and odd number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test27() {
        double[] numbers = {7};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 6
    @Test
    void test28() {
        double[] numbers = {8};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test29() {
        double[] numbers = {9};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 7
    @Test
    void test30() {
        double[] numbers = {73};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Predicate Table: 6
    // Row: 8
    @Test
    void test31() {
        double[] numbers = {57};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 4
    @Test
    void test32() {
        double[] numbers = {-67};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, negative, and odd number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test33() {
        double[] numbers = {83};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 6
    @Test
    void test34() {
        double[] numbers = {382};
        calculator c = new calculator();
        assertEquals("This number is a 3 digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test35() {
        double[] numbers = {71};
        calculator c = new calculator();
        assertEquals("This number is a 2 digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Row: 7
    @Test
    void test36() {
        double[] numbers = {7};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and odd number", c.numberInfo(numbers));
    }

    // Predicate Table: 7
    // Row: 8
    @Test
    void test37() {
        double[] numbers = {-8};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and even number", c.numberInfo(numbers));
    }

    // Row: 4
    @Test
    void test38() {
        double[] numbers = {8};
        calculator c = new calculator();
        assertEquals("This number is a single digit, positive, and even number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test39() {
        double[] numbers = {-4};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and even number", c.numberInfo(numbers));
    }

    // Row: 6
    @Test
    void test40() {
        double[] numbers = {-3};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and odd number", c.numberInfo(numbers));
    }

    // Row: 8
    @Test
    void test41() {
        double[] numbers = {-6};
        calculator c = new calculator();
        assertEquals("This number is a single digit, negative, and even number", c.numberInfo(numbers));
    }

    // Row: 7
    @Test
    void test42() {
        double[] numbers = {-1234};
        calculator c = new calculator();
        assertEquals("This number is a 4 digit, negative, and even number", c.numberInfo(numbers));
    }
}
