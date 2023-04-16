import java.util.*;
public class checkIfN {
    static boolean search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        Arrays.sort(arr);
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(i>0){
                if(arr[i]==arr[i-1])
                    continue;
            }
            if(search(arr,2*arr[i])) {
                System.out.println("true");
                flag=true;
            }
        }
        if(flag)
        System.out.println("false");
    }
}