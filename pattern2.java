import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 2*n-1;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(n - (Math.min(Math.min(j, N-j-1), Math.min(i, N-i-1))));
                System.out.print(' ');
            }
            System.out.println();
        }
        sc.close();
    }
}
