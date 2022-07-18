import org.example.IntegerFilter;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private IntegerFilter sut;
    // Task 1
    @BeforeEach
    public void init() {
        List<Integer> testIntList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        this.sut = new IntegerFilter(testIntList);
        System.out.println("Test begin");
    }
    // Task 1
    @AfterEach
    public void end() {
        System.out.println("Test end");
    }
    // Task 1
    @BeforeAll
    public static void testsBegin() {
        System.out.println("Tests began");
    }
    // Task 1
    @AfterAll
    public static void testsEnd() {
        System.out.println("Tests ended");
    }
    // Task 1
    @Test
    public void testCountOddValues() {
        long expectedValue = 7;
        long actualValue = sut.countOddValues();
        assertEquals(expectedValue, actualValue);
    }
    // Task 1
    @Test
    public void testCountOddAndPositiveValuesMoreThanUserVal() {
        long expectedValue = 2;
        long actualValue = sut.countOddAndPositiveValuesMoreThanUserVal(10);
        assertEquals(expectedValue, actualValue);
    }
    // Task 1
    @Test
    public void testCountPercentOfPositiveValues() {
        float expectedValue = 76.9f;
        float actualValue = sut.countPercentOfPositiveValues();
        assertEquals(expectedValue, actualValue, 0.1);
    }
    // Task 2
    @Test
    public void testGetListOfPositiveValuesMoreThanUserValViaHamcrest1() {
        List<Integer> actualList = sut.getListOfPositiveValuesMoreThanUserVal(10);
        assertThat(actualList, hasItems(16, 23));
    }
    // Task 2
    @Test
    public void testGetListOfPositiveValuesMoreThanUserValViaHamcrest2() {
        int userVal = 10;
        List<Integer> actualList = sut.getListOfPositiveValuesMoreThanUserVal(userVal);
        Integer actualVal = actualList.get(0);
        assertThat(actualVal, allOf(greaterThan(0), greaterThan(userVal)));
    }
}
