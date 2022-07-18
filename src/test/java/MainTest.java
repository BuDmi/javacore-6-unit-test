import org.example.IntegerCounter;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private IntegerCounter sut;

    @BeforeEach
    public void init() {
        List<Integer> testIntList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        this.sut = new IntegerCounter(testIntList);
        System.out.println("Test begin");
    }

    @AfterEach
    public void end() {
        System.out.println("Test end");
    }

    @BeforeAll
    public static void testsBegin() {
        System.out.println("Tests began");
    }

    @AfterAll
    public static void testsEnd() {
        System.out.println("Tests ended");
    }

    @Test
    public void testCountOddValues() {
        long expectedValue = 7;
        long actualValue = sut.countOddValues();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCountOddAndPositiveValuesMoreThanUserVal() {
        long expectedValue = 2;
        long actualValue = sut.countOddAndPositiveValuesMoreThanUserVal(10);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCountPercentOfPositiveValues() {
        float expectedValue = 76.9f;
        float actualValue = sut.countPercentOfPositiveValues();
        assertEquals(expectedValue, actualValue, 0.1);
    }
}
