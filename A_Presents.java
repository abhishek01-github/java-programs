import java.util.*;
public class A_Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[input.nextInt()-1]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+1 + " ");
        }
    }
}