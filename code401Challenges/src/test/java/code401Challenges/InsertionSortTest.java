package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort_positive(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{3, 6, 1, 4, 8};
        int [] expectedOutput = new int[]{1,3,4,6,8};
        is.InsertionSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testInsertionSort_negative(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{3, -6, 1, 4, -8};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4};
        is.InsertionSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInsertionSort_emptyArr(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{};
        is.InsertionSort(arr);
    }
}