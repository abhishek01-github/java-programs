import java.util.*;
public class PythagoreanTriplet {
    static boolean triplet(int a, int b, int c){
        int temp = a;
        if(temp<b){
            a=b;
            b=temp;
        }
        temp = a;
        if(a<c){
            a=c;
            c=temp;
        }
        return (Math.pow(a,2)==(Math.pow(b,2)+Math.pow(c,2)));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
              if(triplet(scn.nextInt(), scn.nextInt(),scn.nextInt()))
                  System.out.println("They are pythagorean triplet");
              else
                  System.out.println("They are not pythagorean triplet");
    }
}