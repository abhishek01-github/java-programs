import java.util.*;
public class C_Find_and_Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            String s = in.next().trim();
            boolean flag = false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j+=2){
                    if(s.charAt(i)==s.charAt(j)){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag==true)
                System.out.println("no");
            else
                System.out.println("yes");
            t--;
        }
    }
}