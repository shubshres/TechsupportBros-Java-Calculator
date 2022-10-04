import com.Calculator.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {


    // -------------------- ADD METHOD -------------------------- //

    // TEST 1: ADD
    // INPUT: {1,1}
    // EXPECTED OUTPUT: 2.0
    @Test
    void test1(){
        double[] arrayAdd = {1,1};
        calculator c = new calculator();
        assertEquals(2.0, c.add(arrayAdd));
    }

    // TEST 2: ADD
    // INPUT: {1,2}
    // EXPECTED OUTPUT: 3.0
    @Test
    void test2(){
        double[] arrayAdd = {1,2};
        calculator c = new calculator();
        assertEquals(3.0, c.add(arrayAdd));
    }

    // TEST 3: ADD
    // INPUT: {-1,1}
    // EXPECTED OUTPUT: -2
    @Test
    void test3(){
        double[] arrayAdd = {-1,-1};
        calculator c = new calculator();
        assertEquals(-2.0, c.add(arrayAdd));
    }

    // TEST 4: ADD
    // INPUT: {-1,-2}
    // EXPECTED OUTPUT: -3
    @Test
    void test4(){
        double[] arrayAdd = {-1,-2};
        calculator c = new calculator();
        assertEquals(-3.0, c.add(arrayAdd));
    }


    // TEST 5: ADD
    // INPUT: {5,5,5}
    // EXPECTED OUTPUT: 15.0
    @Test
    void test5(){
        double[] arrayAdd = {5,5,5};
        calculator c = new calculator();
        assertEquals(15.0, c.add(arrayAdd));
    }

    // TEST 6: ADD
    // INPUT: {1,2,3}
    // EXPECTED OUTPUT: 6.0
    @Test
    void test6(){
        double[] arrayAdd = {1,2,3};
        calculator c = new calculator();
        assertEquals(6.0, c.add(arrayAdd));
    }

    // TEST 7: ADD
    // INPUT: {-3,-3,-3}
    // EXPECTED OUTPUT: -9.0
    @Test
    void test7(){
        double[] arrayAdd = {-3,-3,-3};
        calculator c = new calculator();
        assertEquals(-9, c.add(arrayAdd));
    }

    // TEST 8: ADD
    // INPUT: {-1,-2,-3}
    // EXPECTED OUTPUT: -6.0
    @Test
    void test8(){
        double[] arrayAdd = {-1,-2,-3};
        calculator c = new calculator();
        assertEquals(-6, c.add(arrayAdd));
    }



    // -------------------- SUBTRACT METHOD -------------------------- //

    // TEST 9: SUBTRACT
    // INPUT: {1,1}
    // EXPECTED OUTPUT: 0.O
    @Test
    void test9(){
        double[] arraySubtract = {1,1};
        calculator c = new calculator();
        assertEquals(0.0, c.subtract(arraySubtract));
    }

    // TEST 10: SUBTRACT
    // INPUT: {1,2}
    // EXPECTED OUTPUT: -1.0
    @Test
    void test10(){
        double[] arraySubtract = {1,2};
        calculator c = new calculator();
        assertEquals(-1.0, c.subtract(arraySubtract));
    }

    // TEST 11: SUBTRACT
    // INPUT: {-1,-1}
    // EXPECTED OUTPUT: -2.0
    @Test
    void test11(){
        double[] arraySubtract = {-1,-1};
        calculator c = new calculator();
        assertEquals(0.0, c.subtract(arraySubtract));
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
