import java.util.*;
public class A_Bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for(int i=0;i<n;i++){
            if(input.next().charAt(1)=='+')
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}