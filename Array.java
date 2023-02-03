import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);
//        nums.add(0,1);
//        nums.add(1,2);
//        nums.add(2,3);
//        nums.add(3,4);
//        nums.add(4,5);
//        nums.add(5,6);
//        nums.add(6,7);
//        nums.add(7,8);
//        nums.add(8,9);
//        nums.add(9,10);
//        System.out.println(nums);
//        for(int i=1,j=5;i<10;i+=2,j++){
//            int num = nums.get(j);
//            nums.remove(j);
//            nums.add(i,num);
//        }
//        System.out.println(nums);
        int[] arr = {1,2,3,4,5};
        int[] arrs = new int[10];
        System.arraycopy(arr,0,arrs,0,5);
        System.arraycopy(arr,0,arrs,5,5);
        System.out.println(Arrays.toString(arrs));
        System.out.println(arrs.);
    }
}