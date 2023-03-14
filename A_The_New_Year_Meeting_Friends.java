import java.util.*;
public class A_The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        System.out.println(Math.max(x1,Math.max(x2,x3))-Math.min(x1,Math.min(x2,x3)));
        input.close();
    }
}