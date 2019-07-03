package code401Challenges;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testMergeSort_unevenSize_Positive(){
        QuickSort qs = new QuickSort();
        int [] arr = new int[]{3, 6, 1, 4, 8};
        int [] expectedOutput = new int[]{1,3,4,6,8};
        qs.quickSort(arr, 0, 4);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_unevenSize_Negative(){
        QuickSort qs = new QuickSort();
        int [] arr = new int[]{3, -6, 1, 4, -8};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4};
        qs.quickSort(arr, 0, 4);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_evenSize_Postitive(){
        QuickSort qs = new QuickSort();
        int [] arr = new int[]{3, 6, 1, 4};
        int [] expectedOutput = new int[]{1,3,4,6};
        qs.quickSort(arr, 0, 3);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_evenSize_Negative(){
        QuickSort qs = new QuickSort();
        int [] arr = new int[]{3, -6, 1, -8};
        int [] expectedOutput = new int[]{-8, -6, 1, 3};
        qs.quickSort(arr, 0, 3);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMergeSort_emptyArr(){
        QuickSort qs = new QuickSort();
        int [] arr = new int[]{};
        qs.quickSort(arr, 0, 5);
    }

}