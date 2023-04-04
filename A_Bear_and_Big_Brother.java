import java.util.*;
public class A_Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int count=0;
        while(true){
            if(a>b)
                break;
            a=3*a;
            b=2*b;
            count++;
        }
        System.out.println(count);
    }
}