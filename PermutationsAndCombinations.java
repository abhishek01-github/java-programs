import java.util.*;
public class PermutationsAndCombinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For nCr and nPr, enter the values of n and r");
        int N=1,i,n=in.nextInt();
        int D=1,j,r=in.nextInt();
        if(n>=r && n>0 && r>=0){
            if(r==0) {
                N = n;
                D = n;
            }else if((n-r)>=r){
                for(i=n,j=r;j>=1;i--,j--){
                    N*=i;
                    D*=j;}
            } else{
                for(i=n,j=n-r;j>=1;i--,j--){
                    N*=i;
                    D*=j;}
            }
            System.out.println("nCr = "+(N/D)+" and nPr = "+N);
        }else
            System.out.println("invalid values of n or r");
    }
}