import java.util.*;
public class A_Fox_And_Snake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = 0;
        for(int i=0;i<n;i++){
            if(i%4==0 && i!=0)
                k++;
            for(int j=0;j<m;j++){
                if(i%2==0)
                    System.out.print('#');
                else {
                    if(i==(4*k+1) && j==m-1){
                        System.out.print('#');
                        continue;
                    }
                    if(i==(4*k+3) && j==0){
                        System.out.print('#');
                        continue;
                    }
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}