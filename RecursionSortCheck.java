import java.util.*;
public class RecursionSortCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = {1,3,5,8,7};
        System.out.println(check(a,0));
    }
    static boolean check(int[] arr, int index){
        if(index==arr.length-1)
            return true;
        return arr[index]<=arr[index+1] & check(arr,index+1);
    }
}