import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        int count = 1;
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                count++;
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        System.out.println("The number of subsets is : " + count);
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        int count = 1;
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int end = 0;
        for(int i=0; i<arr.length; i++){
            int start = 0;
            if(i>0 && arr[i]==arr[i-1])
                start = end+1;
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                count++;
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        System.out.println("The number of subsets is : " + count);
        return outer;
    }
}