package code401Challenges;

public class InsertionSort {

    public static void main(String args[]){

    }

    public static void InsertionSort(int [] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("cannot sort empty array");
        }
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j = j-1;

            }
            arr[j + 1] = temp;
        }
    }
}
