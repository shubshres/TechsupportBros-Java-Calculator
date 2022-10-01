import com.Calculator.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {
    @Test
    void testAdd(){
        double[] arrayAdd = {1,2};
        calculator c = new calculator();
        assertEquals(3.0, c.add(arrayAdd));
    }

    @Test
    void testMultiply(){
        double[] arrayMultiply = {7,2,5,8};
        calculator c = new calculator();
        assertEquals(560.0, c.multiply(arrayMultiply));
    }

    @Test
    void testSubtract(){
        double[] arraySubtract = {1,2,9};
        calculator c = new calculator();
        assertEquals(-10.0, c.subtract(arraySubtract));
    }

    @Test
    void testDivide(){
        double[] arrayDivide = {20,2,4};
        calculator c = new calculator();
        assertEquals(2.5, c.divide(arrayDivide));
    }

    @Test
    void testMedianOdd(){
        double[] arrayMedian = {1, 2, 3, 4, 5};
        calculator c = new calculator();
        assertEquals(3, c.median(arrayMedian));
    }

    @Test
    void testMedianEven(){
        double[] arrayMedian = {1, 2, 3, 4, 5, 6};
        calculator c = new calculator();
        assertEquals(3.5, c.median(arrayMedian));
    }

    @Test
    void testRange(){
        double[] arrayRange = {8,9,12,90,2893,1};
        calculator c = new calculator();
        assertEquals(2892.0, c.range(arrayRange));
    }

    @Test
    void testMode(){
        double[] arrayMode = {1, 2, 3, 4, 2, 3, 2, 2, 2};
        calculator c = new calculator();
        assertEquals(2.0, c.mode(arrayMode));
    }

    @Test
    void testStandardDeviation(){
        double[] arrayRange = {8,9,12,90,2893,1};
        calculator c = new calculator();
        assertEquals(1069.642528552829, c.standardDeviation(arrayRange));
    }

    @Test
    void testPythagorean(){
        double[] arrayPythagorean = {6, 8};
        calculator c = new calculator();
        assertEquals(10.0, c.pythagorean(arrayPythagorean));
    }

    @Test
    void testPercentage(){
        double[] arrayPercentage = {6, 100};
        calculator c = new calculator();
        assertEquals(6.0, c.percentage(arrayPercentage));
    }

    @Test
    void testRoot(){
        double[] arrayRoot = {3,27};
        calculator c = new calculator();
        assertEquals(3.0, c.root(arrayRoot));
    }

    @Test
    void testPythagoreanNegative(){
        double[] arrayPythagorean = {6, -8};
        calculator c = new calculator();
        assertEquals(10.0, c.pythagorean(arrayPythagorean));
    }

    @Test
    void testModulos(){
        double[] arrayModulos = {4,17};
        calculator c = new calculator();
        assertEquals(4.0, c.modulos(arrayModulos));
    }

    @Test
    void testDegreesToRadians(){
        double[] arrayDegrees = {180};
        calculator c = new calculator();
        assertEquals(3.141592653589793, c.degreesToRadians(arrayDegrees));
    }

    @Test
    void testAddNull(){
        double[] arrayAdd = {};
        calculator c = new calculator();
        assertEquals(0.0, c.add(arrayAdd));
    }

    @Test
    void testAddNegativeNumbers(){
        double[] arrayAdd = {-7,-2};
        calculator c = new calculator();
        assertEquals(-9.0, c.add(arrayAdd));
    }

    @Test
    void testSubtractWithNegative(){
        double[] arraySubtract = {1,-9};
        calculator c = new calculator();
        assertEquals(10.0, c.subtract(arraySubtract));
    }

    @Test
    void testMultiplyByZero(){
        double[] arrayMultiply = {7,2,5,8,0};
        calculator c = new calculator();
        assertEquals(0.0, c.multiply(arrayMultiply));
    }

    @Test
    void testPythagoreanZero(){
        double[] arrayPythagorean = {0, 0};
        calculator c = new calculator();
        assertEquals(0.0, c.pythagorean(arrayPythagorean));
    }

    @Test
    void testRootZero(){
        double[] arrayRoot = {6,0};
        calculator c = new calculator();
        assertEquals(0.0, c.root(arrayRoot));
    }
}
