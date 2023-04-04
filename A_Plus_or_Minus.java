import java.util.*;
public class A_Plus_or_Minus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a-b==c)
                System.out.println("-");
            else
                System.out.println("+");
        }
    }
}