import java.util.*;
public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(scn.nextInt()==1){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("hard");
        else
            System.out.println("easy");
    }
}