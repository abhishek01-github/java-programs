import java.util.Arrays;

public class ArraysAccess {
    public static void main(String[] args) {
        int[] arr = {23,534,34,42,54};
        // using for each loop
        for(int num : arr)
            System.out.println(num + " ");
        // using to string method
        System.out.println(Arrays.toString(arr));
    }
}