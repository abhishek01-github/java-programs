import java.util.*;
public class A_Maximum_Increase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        int maxCount=1;
        int a=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int b=input.nextInt();
            if(b>a)
                count++;
            else{
                if(count>maxCount)
                    maxCount=count;
                count=1;
            }
            a=b;
        }
        if(count<maxCount)
            System.out.println(maxCount);
        else
            System.out.println(count);
    }
}