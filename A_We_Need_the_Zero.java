import java.util.*;
public class A_We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int n=input.nextInt();
            int x=0;
            for(int i=0;i<n;i++){
                x=x^input.nextInt();
            }
            if(n%2==0){
                if(x==0)
                    System.out.println(1);
                else
                    System.out.println(-1);
            }
            else
                System.out.println(x);
            t--;
        }
    }
}