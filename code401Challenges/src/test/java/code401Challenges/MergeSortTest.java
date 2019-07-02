package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort_unevenSize_Positive(){
        MergeSort ms = new MergeSort();
        int [] arr = new int[]{3, 6, 1, 4, 8};
        int [] expectedOutput = new int[]{1,3,4,6,8};
        ms.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_unevenSize_Negative(){
        MergeSort ms = new MergeSort();
        int [] arr = new int[]{3, -6, 1, 4, -8};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4};
        ms.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_evenSize_Postitive(){
        MergeSort ms = new MergeSort();
        int [] arr = new int[]{3, 6, 1, 4};
        int [] expectedOutput = new int[]{1,3,4,6};
        ms.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_evenSize_Negative(){
        MergeSort ms = new MergeSort();
        int [] arr = new int[]{3, -6, 1, -8};
        int [] expectedOutput = new int[]{-8, -6, 1, 3};
        ms.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMergeSort_emptyArr(){
        MergeSort ms = new MergeSort();
        int [] arr = new int[]{};
        ms.mergeSort(arr);
    }

}