import java.util.*;
public class TaisiaAndDice {
    static void combinations(int n,int s,int r){
        System.out.print(s-r + " ");
        int num = s-r;
        while((n-1)!=0){
            if(n==2) {
                System.out.println(r);
                return;
            }
            for(int i=1;i<=6;i++){
                if((r-i)/(n-2)<num || ((r-i)/(n-2)==num && (r-i)%(n-2)==0)) {
                    System.out.print(i + " ");
                    r-=i;
                    break;
                }
            }
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int s = input.nextInt();
            int r = input.nextInt();
            combinations(n,s,r);
        }
    }
}