import java.util.*;
public class A_Repeating_Cipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next().trim();
        int c=0;
        for(int i=0;i<(int)Math.sqrt(2*n);i++){
            c+=i;
            System.out.print(s.charAt(c));
        }
    }
}