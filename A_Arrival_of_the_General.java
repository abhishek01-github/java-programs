import java.util.*;
public class A_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max=0;
        int maxNum=Integer.MIN_VALUE;
        int min=0;
        int minNum=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int num = input.nextInt();
            if(num>maxNum){
                maxNum = num;
                max = i;
            }
            if(num<=minNum){
                minNum = num;
                min = i;
            }
        }
        if(max>min)
            System.out.println(max+n-min-2);
        else
            System.out.println(max+n-min-1);
    }
}