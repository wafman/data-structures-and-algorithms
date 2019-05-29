package code401Challenges;

public class ArrayShift {
    public int[] insertShiftArr(int[] arr, int x){
        int[] newArr = new int[arr.length + 1];
        int insertPoint = (int) (Math.ceil(newArr.length / 2));
        for(int i = 0; i < newArr.length; i++){
            if(i < insertPoint){
                newArr[i] = arr[i];
            } else if(i == insertPoint){
                newArr[i] = x;
            } else if(i > insertPoint){
                newArr[i] = arr[i -1];
            }
        }
        return newArr;
    }
}
