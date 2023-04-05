import java.util.*;
public class A_Insert_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0) {
            int n = input.nextInt();
            int d=input.nextInt();
            String s=input.next().trim();
            int pos=-1;
            for(int i=0;i<n;i++){
                if(Integer.parseInt(String.valueOf(s.charAt(i)))<=d){
                    if(pos==-1)
                    pos=i;
                } else if(Integer.parseInt(String.valueOf(s.charAt(i)))>d && pos!=-1)
                    pos=-1;
                if(Integer.parseInt(String.valueOf(s.charAt(i)))<d && pos!=-1)
                    break;
            }
            for(int i=0;i<n;i++) {
                if(i==pos)
                    System.out.print((char)(d+'0'));
                System.out.print(s.charAt(i));
            }
            if(pos==-1)
            System.out.print((char)(d+'0'));
            System.out.println();
            t--;
        }
    }
}