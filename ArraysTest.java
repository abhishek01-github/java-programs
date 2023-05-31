import java.util.*;
public class ArraysTest {
    static void fun(int[] arr){
        arr[1]=0;
    }
    public static void main(String[] args) {
        int[] arr = {12,44,53,65,78};
        System.out.println(Arrays.toString(arr));
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}