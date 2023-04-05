import java.util.*;
public class C_Restore_the_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int n=input.nextInt();
            int[] a = new int[n];
            boolean flag=false;
            for(int i=0;i<n;i++){
                int b=input.nextInt();
                if (i>0 && flag==false) {
                    if(Math.max(a[i-1],b)==b) {
                        a[i] = 0;
                        flag=true;
                        i++;
                    }
                } else 
                a[i]=b;
            }
            t--;
        }
    }
}