import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0,y=0,steps;
        int[][] matrix = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=input.nextInt();
                if(matrix[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        x=Math.abs(x-2);
        y=Math.abs(y-2);
        System.out.println(x+y);
    }
}