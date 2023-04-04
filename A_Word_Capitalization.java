import java.util.*;
public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next().trim();
        if(s.charAt(0)>'Z')
            System.out.print((char)(s.charAt(0)-32));
        else
            System.out.print(s.charAt(0));
        for(int i=1;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}