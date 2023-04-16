import java.util.*;
public class A_Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            String s=input.next();
            int start=-1;
            int end=-1;
            boolean flag1=false;
            boolean flag2=false;
            for(int i=0,j=s.length()-1;i<s.length();i++,j--){
                if(s.charAt(i)=='1' && flag1==false){
                    start=i;
                    flag1=true;
                }
                if(s.charAt(j)=='1' && flag2==false){
                    end=j;
                    flag2=true;
                }
            }
            int count=0;
            if(start>=0 && end>=0) {
                while (start < end) {
                    if (s.charAt(start) == '0')
                        count++;
                    start++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}