import java.util.*;
public class RecursionSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,5,7,1,8};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c, int max){
        if(r==0)
            return;
        if(c<r){
            if(arr[max]<arr[c])
                sort(arr,r,c+1,c);
            else
                sort(arr,r,c+1,max);
        } else {
            swap(arr,c-1,max);
            sort(arr,r-1,0,0);
        }
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}