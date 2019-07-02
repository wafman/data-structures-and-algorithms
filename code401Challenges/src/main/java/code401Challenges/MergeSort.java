package code401Challenges;



public class MergeSort {
    public static void mergeSort(int [] arr){
        if(arr.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }

        int n = arr.length;

        if(arr.length > 1){
            int mid = n / 2;
            int[] b = new int[mid];
            int[] c = new int[n - mid];

            for(int i = 0; i < mid; i++){
                b[i] = arr[i];
            }
            for(int j = mid; j < n; j++){
                c[j - mid] = arr[j];
            }

            mergeSort(b);
            mergeSort(c);

            merge(b, c, arr);
        }

    }

    public static int[] merge(int[]b, int[]c, int[]a){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < b.length && j < c.length){
            if(b[i] <= c[j]){
                a[k] = b[i];
                i = i + 1;
            }
            else {
                a[k] = c[j];
                j = j + 1;
            }
            k = k + 1;
        }

        if(i == b.length){
            //add remaining items in array c to array a
            while(j < c.length){
                a[k] = c[j];
                j++;
                k++;
            }
        }
        else {
            //add remaining items in array b to array a
            while(i < b.length){
                a[k] = b[i];
                i++;
                k++;
            }
        }

        return a;
    }
}
