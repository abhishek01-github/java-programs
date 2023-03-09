import java.util.*;
public class A_Likes {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();
            int p=0,N=0;
            while(n>0){
                if(input.nextInt()>0)
                    p++;
                else
                    N++;
                n--;
            }
            int ans = 0;
            int P = p;
            int Neg = N;
            while(p>0) {
                System.out.print(++ans + " ");
                p--;
            }
            while(N>0) {
                System.out.print(--ans + " ");
                N--;
            }
            System.out.println();
            ans = 0;
            while(P>0){
                    System.out.print(++ans + " ");
                    P--;
                    if(Neg>0){
                        System.out.print(--ans + " ");
                        Neg--;
                    }
                }
                System.out.println();
            t--;
        }
    }
}