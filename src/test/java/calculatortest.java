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




// -------------------- checkMultiples METHOD -------------------------- //

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

    

    // TEST 12: SUBTRACT
    // INPUT: {-1,-2}
    // EXPECTED OUTPUT: -3.0
    @Test
    void test12(){
        double[] arraySubtract = {-1,-2};
        calculator c = new calculator();
        assertEquals(1.0, c.subtract(arraySubtract));
    }

    // TEST 13: SUBTRACT
    // INPUT: {5,5,5}
    // EXPECTED OUTPUT: -5.0
    @Test
    void test13(){
        double[] arraySubtract = {5,5,5};
        calculator c = new calculator();
        assertEquals(-5.0, c.subtract(arraySubtract));
    }

    // TEST 14: SUBTRACT
    // INPUT: {1,2,3}
    // EXPECTED OUTPUT: -4.0
    @Test
    void test14(){
        double[] arraySubtract = {1,2,3};
        calculator c = new calculator();
        assertEquals(-4.0, c.subtract(arraySubtract));
    }


    // TEST 15: SUBTRACT
    // INPUT: {-3,-3,-3}
    // EXPECTED OUTPUT: 3
    @Test
    void test15(){
        double[] arraySubtract = {-3,-3,-3};
        calculator c = new calculator();
        assertEquals(3.0, c.subtract(arraySubtract));
    }

    // TEST 16: SUBTRACT
    // INPUT: {-1,-2,-3}
    // EXPECTED OUTPUT: 4
    @Test
    void test16(){
        double[] arraySubtract = {-1,-2,-3};
        calculator c = new calculator();
        assertEquals(4.0, c.subtract(arraySubtract));
    }

// -------------------- MULTIPLY METHOD -------------------------- //

    // TEST 17: MULTIPLY
    // INPUT: {1,1}
    // EXPECTED OUTPUT: 1
    @Test
    void test17(){
        double[] arrayMultiply = {1,1};
        calculator c = new calculator();
        assertEquals(1.0, c.multiply(arrayMultiply));
    }

    // TEST 18: MULTIPLY
    // INPUT: {1,2}
    // EXPECTED OUTPUT: 2
    @Test
    void test18(){
        double[] arrayMultiply = {1,2};
        calculator c = new calculator();
        assertEquals(2.0, c.multiply(arrayMultiply));
    }

    // TEST 19: MULTIPLY
    // INPUT: {-1,-1}
    // EXPECTED OUTPUT: 1.0
    @Test
    void test19(){
        double[] arrayMultiply = {-1,-1};
        calculator c = new calculator();
        assertEquals(1.0, c.multiply(arrayMultiply));
    }

    // TEST 20: MULTIPLY
    // INPUT: {-1,-2}
    // EXPECTED OUTPUT: 2.0
    @Test
    void test20(){
        double[] arrayMultiply = {-1,-2};
        calculator c = new calculator();
        assertEquals(2.0, c.multiply(arrayMultiply));
    }


    // TEST 21: MULTIPLY
    // INPUT: {5,5,5}
    // EXPECTED OUTPUT: 125.0
    @Test
    void test21(){
        double[] arrayMultiply = {5,5,5};
        calculator c = new calculator();
        assertEquals(125.0, c.multiply(arrayMultiply));
    }

    // TEST 22: MULTIPLY
    // INPUT: {1,2,3}
    // EXPECTED OUTPUT: 6
    @Test
    void test22(){
        double[] arrayMultiply = {1,2,3};
        calculator c = new calculator();
        assertEquals(6.0, c.multiply(arrayMultiply));
    }

    // TEST 23: MULTIPLY
    // INPUT: {-3,-3,-3}
    // EXPECTED OUTPUT: -27.0
    @Test
    void test23(){
        double[] arrayMultiply = {-3,-3,-3};
        calculator c = new calculator();
        assertEquals(-27.0, c.multiply(arrayMultiply));
    }

    // TEST 24: MULTIPLY
    // INPUT: {-1,-2,-3}
    // EXPECTED OUTPUT: -6.0
    @Test
    void test24(){
        double[] arrayMultiply = {-1,-2,-3};
        calculator c = new calculator();
        assertEquals(-6.0, c.multiply(arrayMultiply));
    }

    @Test
    void test25(){
        double[] arrayMedian = {1,2,3};
        calculator c = new calculator();
        assertEquals(2.0, c.median(arrayMedian));
    }
    @Test
    void test26(){
        double[] arrayMedian = {1,1,1};
        calculator c = new calculator();
        assertEquals(1.0, c.median(arrayMedian));
    }

    @Test
    void test27(){
        double[] arrayMedian = {2,2};
        calculator c = new calculator();
        assertEquals(2.0, c.median(arrayMedian));
    }

    @Test
    void test28(){
        double[] arrayMedian = {2,1};
        calculator c = new calculator();
        assertEquals(1.5, c.median(arrayMedian));
    }
    @Test
    void test29(){
        double[] arrayDivide = {-1,-1};
        calculator c = new calculator();
        assertEquals(1.0, c.divide(arrayDivide));
    }
    @Test
    void test30(){
        double[] arrayDivide = {1,1};
        calculator c = new calculator();
        assertEquals(1.0, c.divide(arrayDivide));
    }

    @Test
    void test31(){
        double[] arrayDivide = {-1,2};
        calculator c = new calculator();
        assertEquals(-0.5, c.divide(arrayDivide));
    }

    @Test
    void test32(){
        double[] arrayDivide = {1,2};
        calculator c = new calculator();
        assertEquals(0.5, c.divide(arrayDivide));
    }

    @Test
    void test33(){
        double[] arrayDivide = {-3,-3,-3};
        calculator c = new calculator();
        assertEquals(-0.3333333333333333, c.divide(arrayDivide));
    }

    @Test
    void test34(){
        double[] arrayDivide = {2,2,2};
        calculator c = new calculator();
        assertEquals(0.5, c.divide(arrayDivide));
    }

    @Test
    void test35(){
        double[] arrayDivide = {-1,2,3};
        calculator c = new calculator();
        assertEquals(-0.16666666666666666, c.divide(arrayDivide));
    }

    @Test
    void test36(){
        double[] arrayDivide = {1,3,7};
        calculator c = new calculator();
        assertEquals(0.047619047619047616, c.divide(arrayDivide));
    }

    @Test
    void test37(){
        double[] arrayMean = {2,2};
        calculator c = new calculator();
        assertEquals(2.0, c.mean(arrayMean));
    }

    @Test
    void test38(){
        double[] arrayMean = {1,2};
        calculator c = new calculator();
        assertEquals(1.5, c.mean(arrayMean));
    }

    @Test
    void test39(){
        double[] arrayMean = {-1,-1};
        calculator c = new calculator();
        assertEquals(-1.0, c.mean(arrayMean));
    }

    @Test
    void test40(){
        double[] arrayMean = {-2,-3};
        calculator c = new calculator();
        assertEquals(-2.5, c.mean(arrayMean));
    }

    @Test
    void test41(){
        double[] arrayMean = {1,1,1};
        calculator c = new calculator();
        assertEquals(1.0, c.mean(arrayMean));
    }

    @Test
    void test42(){
        double[] arrayMean = {1,2,3};
        calculator c = new calculator();
        assertEquals(2.0, c.mean(arrayMean));
    }

    @Test
    void test43(){
        double[] arrayMean = {-1,-1,-1};
        calculator c = new calculator();
        assertEquals(-1.0, c.mean(arrayMean));
    }

    @Test
    void test44(){
        double[] arrayMean = {-1,2,8};
        calculator c = new calculator();
        assertEquals(3.0, c.mean(arrayMean));
    }



}
