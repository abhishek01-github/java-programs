import java.util.*;
public class A_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int a=input.nextInt();
            int b=input.nextInt();
            int n=input.nextInt();
            int count=0;
            if(a>b){
                b+=a;
                count++;
            }
            while(a<=n && b<=n){
                a+=b;
                count++;
                if(a<=n){
                    b+=a;
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}