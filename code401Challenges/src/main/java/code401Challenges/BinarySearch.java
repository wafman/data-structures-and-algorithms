package code401Challenges;

public class BinarySearch {
    public int binarySearch(int[] arr, int num){
        int index = 0;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < num){
                low = mid + 1;
            } else if(arr[mid] > num){
                high = mid - 1;
            } else if(arr[mid] == num) {
                index = mid;
                break;
            }else if(mid != num){
                return -1;
            }
        }
        if(high < low){
            return -1;
        }
        return index;
    }
}
