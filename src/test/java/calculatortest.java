import com.Calculator.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {


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


    // TEST 4: add()
    @Test
    void test4() {

        double[] numbers = {3, 2, 1};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant4(numbers);

        //System.out.println(c.add(numbers));
        //System.out.println(c.addMutant4(numbers));

        assertFalse(normalOutput == mutantOutput);

    }


    // TEST 5: add()
    @Test
    void test5() {


        double[] numbers = {6, 3, 1};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant5(numbers);

        //System.out.println(c.add(numbers));
        //System.out.println(c.addMutant5(numbers));

        assertFalse(normalOutput == mutantOutput);


    }



    // TEST 6: add()
    @Test
    void test6() {

        double[] numbers = {2, 4, 6};
        calculator c = new calculator();

        double normalOutput = c.add(numbers);
        double mutantOutput = c.addMutant6(numbers);

        //System.out.println(c.add(numbers));
        //System.out.println(c.addMutant5(numbers));

        assertFalse(normalOutput == mutantOutput);

    }

    // TEST 7: multiply()
    @Test
    void test7() {

        double[] numbers = {2, 4, 6};
        calculator c = new calculator();

        double normalOutput = c.multiply(numbers);
        double mutantOutput = c.multiplyMutant1(numbers);

        //System.out.println(c.multiply(numbers));
        //System.out.println(c.multiplyMutant1(numbers));

        assertFalse(normalOutput == mutantOutput);


    }


    // TEST 8: multiply()
    @Test
    void test8() {

        double[] numbers = {3, 5, 8};
        calculator c = new calculator();

        double normalOutput = c.multiply(numbers);
        double mutantOutput = c.multiplyMutant2(numbers);

        //System.out.println(c.multiply(numbers));
        //System.out.println(c.multiplyMutant2(numbers));

        assertFalse(normalOutput == mutantOutput);


    }


    // TEST 9: multiply()
    @Test
    void test9() {

        double[] numbers = {6, 2, 5};
        calculator c = new calculator();

        double normalOutput = c.multiply(numbers);
        double mutantOutput = c.multiplyMutant3(numbers);

        //System.out.println(c.multiply(numbers));
        //System.out.println(c.multiplyMutant3(numbers));

        assertFalse(normalOutput == mutantOutput);


    }



    // TEST 10: multiply()
    @Test
    void test10() {

        double[] numbers = {7, 2, 1};
        calculator c = new calculator();

        double normalOutput = c.multiply(numbers);
        double mutantOutput = c.multiplyMutant4(numbers);

        //System.out.println(c.multiply(numbers));
        //System.out.println(c.multiplyMutant4(numbers));

        assertNotEquals(normalOutput, mutantOutput, 0.0);



    }


    // TEST 11: multiply()
    @Test
    void test11() {

        double[] numbers = {4, 4, 4};
        calculator c = new calculator();

        double normalOutput = c.multiply(numbers);
        double mutantOutput = c.multiplyMutant5(numbers);

        //System.out.println(c.multiply(numbers));
        //System.out.println(c.multiplyMutant5(numbers));

        assertFalse(normalOutput == mutantOutput);

    }

    // TEST 12: mean()

    @Test
    void test12() {

        double[] numbers = {4, 4, 4};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant1(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant1(numbers));

        assertFalse(normalOutput == mutantOutput);




    }





    // TEST 13: mean()
    @Test
    void test13() {

        double[] numbers = {2, 4, 8};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant2(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant2(numbers));

        assertFalse(normalOutput == mutantOutput);


    }

    // TEST 14: mean()
    @Test
    void test14() {

        double[] numbers = {2, 2, 2};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant3(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant3(numbers));

        assertFalse(normalOutput == mutantOutput);


    }

    // TEST 15: mean()
    @Test
    void test15() {

        double[] numbers = {7, 7, 7};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant4(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant4(numbers));

        assertFalse(normalOutput == mutantOutput);



    }

    // TEST 16: mean()
    @Test
    void test16() {

        double[] numbers = {5, 5, 5};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant5(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant5(numbers));

        assertFalse(normalOutput == mutantOutput);



    }

    // TEST 17: mean()
    @Test
    void test17() {

        double[] numbers = {3, 3, 3};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant6(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant6(numbers));

        assertFalse(normalOutput == mutantOutput);


    }

    // TEST 18: mean()
    @Test
    void test18() {

        double[] numbers = {8, 8, 8};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant7(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant7(numbers));

        assertFalse(normalOutput == mutantOutput);



    }

    // TEST 19: mean()
    @Test
    void test19() {

        double[] numbers = {12, 12, 12};
        calculator c = new calculator();

        double normalOutput = c.mean(numbers);
        double mutantOutput = c.meanMutant8(numbers);

        //System.out.println(c.mean(numbers));
        //System.out.println(c.meanMutant8(numbers));

        assertFalse(normalOutput == mutantOutput);


    }


    @Test
    void test20() {
        double[] numbers = {2, 3, 4};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant1(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test21() {
        double[] numbers = {3,1,5};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant2(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test22() {
        double[] numbers = {2,6,8};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant3(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test23() {
        double[] numbers = {9, 1, 6};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant4(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test24() {
        double[] numbers = {12, 9, 1};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant5(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test25() {
        double[] numbers = {22, 4, 2};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant6(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test26() {
        double[] numbers = {21, 2, 3};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant7(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test27() {
        double[] numbers = {8, 4, 29};
        calculator c = new calculator();

        double normalOutput = c.subtract(numbers);
        double mutantOutput = c.subtractMutant8(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test28() {
        double[] numbers = {3, 1, 2};
        calculator c = new calculator();

        double normalOutput = c.divide(numbers);
        double mutantOutput = c.divideMutant1(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test29() {
        double[] numbers = {4, 3, 9};
        calculator c = new calculator();

        double normalOutput = c.divide(numbers);
        double mutantOutput = c.divideMutant2(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test30() {
        double[] numbers = {4, 2, 1};
        calculator c = new calculator();

        double normalOutput = c.divide(numbers);
        double mutantOutput = c.divideMutant3(numbers);
        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test31() {
        double[] numbers = {24, 3, 2};
        calculator c = new calculator();

        double normalOutput = c.divide(numbers);
        double mutantOutput = c.divideMutant4(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test32() {
        double[] numbers = {50, 5, 2};
        calculator c = new calculator();

        double normalOutput = c.divide(numbers);
        double mutantOutput = c.divideMutant5(numbers);


        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test33() {
        double[] numbers = {1, 2, 3, 4, 5, 6};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant1(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test34() {
        double[] numbers = {1, 2};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant2(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test35() {
        double[] numbers = {1, 2, 3, 4};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant3(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test36() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant4(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test37() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant5(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test38() {
        double[] numbers = {1, 2};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant6(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test39() {
        double[] numbers = {1, 2};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant7(numbers);

        assertFalse(normalOutput == mutantOutput);
    }

    @Test
    void test40() {
        double[] numbers = {1, 2, 3, 4, 5, 6};
        calculator c = new calculator();

        double normalOutput = c.median(numbers);
        double mutantOutput = c.medianMutant8(numbers);

        assertFalse(normalOutput == mutantOutput);
    }
}



