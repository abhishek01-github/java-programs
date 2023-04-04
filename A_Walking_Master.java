import java.util.*;
public class A_Walking_Master {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            if(d<b)
                System.out.println(-1);
            else if(d==b && c<a)
                System.out.println(a-c);
            else if(d>b){
                if(c==a)
                    System.out.println(2*(d-b));
                else if(c<a)
                    System.out.println(2*(d-b)+(a-c));
                else
                    if((c-a)-(d-b)>0)
                        System.out.println(-1);
                    else
                        System.out.println(2*(d-b)-(c-a));
            }
            else if(d==b && c==a)
                System.out.println(0);
            else
                System.out.println(-1);
        }
    }
}
