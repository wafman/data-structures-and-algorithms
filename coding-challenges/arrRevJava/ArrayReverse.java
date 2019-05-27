import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    int[] answer = new int[inputArray.length];
    int temp = inputArray.length;
    for(int i = 0; i < inputArray.length; i++){
      answer[temp - 1] = inputArray[i];
      temp -= 1;
    }
    return answer;
  }
    
}