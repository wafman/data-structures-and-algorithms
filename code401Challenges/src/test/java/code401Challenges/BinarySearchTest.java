package code401Challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearch_present(){
        BinarySearch classUnderTest = new BinarySearch();
        int num = 15;
        int[] arr = new int[]{4,8,15,16,23,42};
        int expectedOutput = 2;
        assertEquals("binary search should return index 2 where number 15 is located",
                expectedOutput,
                classUnderTest.binarySearch(arr,num));
    }

    @Test
    public void testBinarySearch_notPresent(){
        BinarySearch classUnderTest = new BinarySearch();
        int num = 90;
        int[] arr = new int[]{11,22,33,44,55,66,77};
        int expectedOutput = -1;
        assertEquals("binary search should return -1 when number is not in array",
                expectedOutput,
                classUnderTest.binarySearch(arr, num));
    }
}
