import java.util.*;
public class A_Soft_Drinking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int p = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();
        System.out.println((Math.min((k*l)/nl,Math.min(p/np,c*d)))/n);
    }
}