import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        String s = input.next().trim();
        int[][] a = new int[7][2];
        for(int i=0;i<N;i++){
            a[i][0]=input.nextInt();
            a[i][1]=input.nextInt();
        }
        int x=a[0][0];
        int y=a[0][1];
        for(int i=0;i<M;i++){
            if(s.charAt(i)=='A')

        }
    }
}