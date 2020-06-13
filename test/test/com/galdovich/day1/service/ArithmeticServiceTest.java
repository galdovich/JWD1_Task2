package test.com.galdovich.day1.service;


import com.galdovich.day1.entity.Point;
import com.galdovich.day1.exception.NumberException;
import com.galdovich.day1.service.ArithmeticService;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticServiceTest {
    ArithmeticService arithmeticService;

    @BeforeTest
    public void setUp() {
       arithmeticService = new ArithmeticService();
    }

    @Test
    public void testCountLastDigitSquarePositive(){
        try{
            int actual = arithmeticService.countLastDigitSquare(43);
            int expected = 9;
            assertEquals(actual, expected);
        }catch (NumberException exc){fail(exc.getMessage());}

    }

    @Test
    public void testCountLastDigitSquareNegative(){
        try{
            int actual = arithmeticService.countLastDigitSquare(43);
            int expected = -4;
            assertNotEquals(actual, expected);
        }catch (NumberException exc){fail(exc.getMessage());}
    }

    @Test(expectedExceptions = NumberException.class, expectedExceptionsMessageRegExp = "Number is negative")
    public void testCountLastDigitSquareException () throws NumberException {
        arithmeticService.countLastDigitSquare(-5);
    }

    @Test
    public void testIsEvenMoreTwoPositive() {
        try {
            boolean actual = arithmeticService.isEvenMoreTwo(3, 4, 6, 1);
            assertTrue(actual);
        } catch (NumberException exc) {fail(exc.getMessage());
        }
    }

    @Test
    public void testIsEvenMoreTwoNegative() {
        try {
            boolean actual = arithmeticService.isEvenMoreTwo(3, 1, 6, 1);
            assertNotEquals(actual, true);
        } catch (NumberException exc) {
            fail(exc.getMessage());
        }
    }

    @Test(expectedExceptions = NumberException.class, expectedExceptionsMessageRegExp = "You must enter four numbers")
    public void testIsEvenMoreTwoException () throws NumberException {
        arithmeticService.isEvenMoreTwo(3,5,6,2,6);
    }



    @Test
    public void testIsPerfectPositive() {
        try{
            boolean actual = arithmeticService.isPerfect(6);
            assertTrue(actual);
        }catch (NumberException exc){fail(exc.getMessage());}
    }

    @Test
    public void testIsPerfectNegative() {
        try{
            boolean actual = arithmeticService.isPerfect(5);
            assertNotEquals(actual, true);
        }catch (NumberException exc){fail(exc.getMessage());}
    }

    @Test(expectedExceptions = NumberException.class)
    public void testIsPerfectException () throws NumberException {
        arithmeticService.isPerfect(-5);
    }

    @DataProvider(name = "dataForClosestPoint")
    @Test
    public Object[][] dataForDefineClosestPoint() {
        return new Object[][]{
                {new Point("First point ",4, 2), new Point("Second point ",6, 9), 1},
                {new Point("First point ",-3, 4), new Point("Second point ",4, 1), 2},
                {new Point("First point ",2, 2), new Point("Second point ",-2, -2), 0}
        };
    }

    @Test(dataProvider = "dataForClosestPoint")
    public void testDefineClosestPoint(Point firstPoint,
                                       Point secondPoint,
                                       int expectedResult) {
        try {
            int actualResult = arithmeticService.defineClosestPoint(firstPoint,
                    secondPoint);
            assertEquals(actualResult, expectedResult);
        } catch (NumberException e) {
            fail(e.getMessage());
        }
    }

    @DataProvider(name = "dataForClosestPointException")
    @Test
    public Object[][] dataForClosestPointException() {
        return new Object[][]{
                {new Point("First point",120, -1.1), new Point("Second point",4, 9)},
                {new Point("First point",-5, -7), new Point("Second point",-120.2, -3)},
                {new Point("First point",-120, 4), new Point("Second point",230, -44.2)}
        };
    }

    @Test(dataProvider = "dataForClosestPointException",
            expectedExceptions = NumberException.class)
    public void testDefineClosestPointException(Point firstPoint,
                                                Point secondPoint)
            throws NumberException {
        arithmeticService.defineClosestPoint(firstPoint,
                secondPoint);
    }

    @DataProvider(name = "dataForTaskCountFunction")
    public Object[][] createArguments() {
        return new Object[][]{{1, -0.200}, {5, 49.000}, {-4, -0.014}};
    }

    @Test(dataProvider = "dataForTaskCountFunction")
    public void testCountFunctionPositive(double argument, double expected) {
        double actual = arithmeticService.countFunction(argument);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testCountFunctionNegative() {
        double actual = arithmeticService.countFunction(5);
        double expected = 23;
        assertNotEquals(actual, expected, 0.001);
    }



}
