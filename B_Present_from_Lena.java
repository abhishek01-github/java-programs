import java.io.*;
import java.util.*;
public class B_Present_from_Lena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row=0;row<2*n+1;row++){
            int rowNum = row<=n ? row : 2*n-row;
            for(int space=0;space<n-rowNum;space++){
                System.out.print("  ");
            }
            for(int col=0;col<=rowNum;col++){
                System.out.print(col);
                if(rowNum!=0)
                    System.out.print(" ");
            }
            for(int col=rowNum-1;col>=0;col--){
                System.out.print(col);
                if(col!=0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}