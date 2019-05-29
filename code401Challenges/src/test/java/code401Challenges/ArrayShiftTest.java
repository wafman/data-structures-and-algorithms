package code401Challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testInsertShiftArray_Even(){
        ArrayShift classUnderTest = new ArrayShift();
        int x = 5;
        int[] arr = new int[]{1,2,3,4};
        int[] expectedOutput = new int[]{1,2,5,3,4};
        assertArrayEquals("inserting into an even length array should put insert value into middle",
                expectedOutput,
                classUnderTest.insertShiftArr(arr, x));

    }

    @Test
    public void testInsertShiftArray_Odd(){
        ArrayShift classUnderTest = new ArrayShift();
        int x = 5;
        int[] arr = new int[]{1,2,3,4,5};
        int[] expectedOutput = new int[]{1,2,3,5,4,5};
        assertArrayEquals("inserting into an odd length array should put value to right of the middle index",
                expectedOutput,
                classUnderTest.insertShiftArr(arr, x));
    }
}
