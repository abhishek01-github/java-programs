import java.util.Scanner;
public class ServalAndInversionMagic {
    static boolean checkPalin(int n,String s){
        int flag1=0,flag2=0;
        for(int i=0,j=n-1;i<=n/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                flag1=1;
            if(s.charAt(i)==s.charAt(j)){
                if((flag1==1) && (flag2==0)){
                    flag2=1;
                    flag1=0;
                }
            }
            if(flag1==1 && flag2==1)
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            String s = input.next().trim();
            if(checkPalin(n,s))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}