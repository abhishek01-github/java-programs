import java.util.*;
public class A_Boring_Apartments {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t>0){
            int x=input.nextInt();
            int digits=(int)Math.log10(x)+1;
            System.out.println(10*(x%10-1)+digits*(digits+1)/2);
            t--;
        }
    }
}