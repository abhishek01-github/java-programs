import java.util.*;
public class A_Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int faces=0;
        while(n>0){
            String s = input.next().trim();
            if(s.charAt(0)=='T')
                faces+=4;
            else if(s.charAt(0)=='C')
                faces+=6;
            else if(s.charAt(0)=='O')
                faces+=8;
            else if(s.charAt(0)=='D')
                faces+=12;
            else
                faces+=20;
            n--;
        }
        System.out.println(faces);
    }
}