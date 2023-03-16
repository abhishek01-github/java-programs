import java.util.*;
public class A_Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int count=0;
            String n = input.next().trim();
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)!='0')
                    count++;
            }
            System.out.println(count);
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)!='0'){
                    System.out.print((n.charAt(i)-48)*(int)Math.pow(10,n.length()-i-1) + " ");
                }
            }
            System.out.println();
            t--;
        }
    }
}