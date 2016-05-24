package work.hophiuchus.algorithms.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {
    static int[] num = new int[]{6,3,1,7,5,4};

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
    }
    @Test
    public void insertionSortTest(){
        SortStrategy sort = new InsertionSort();

        Arrays.stream(sort.sort(num)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(((InsertionSort)sort).sort2(num)).forEach(System.out::print);

    }
    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
    }
}