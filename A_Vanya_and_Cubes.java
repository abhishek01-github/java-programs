import java.util.*;
public class A_Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int ans=(int)Math.cbrt(6*n);
        if(ans*(ans+1)*(ans+2)<=(6*n))
            System.out.println(ans);
        else
            System.out.println(ans-1);
    }
}