import java.util.*;
public class A_Tram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int capacity=0,a=0;
        for(int i=0;i<n;i++){
            a-=input.nextInt();
            a+=input.nextInt();
            if(capacity<a)
                capacity=a;
        }
        System.out.println(capacity);
    }
}