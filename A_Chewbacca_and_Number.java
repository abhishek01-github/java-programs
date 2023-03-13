import java.util.*;
public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        for(int i=0;i<=(int)Math.log10(x);i++){
            long digit = (x/(long)Math.pow(10,i))%10;
            if(digit==9 && i==(int)Math.log10(x))
                break;
            if(digit>=5){
                digit = 9-digit;
                x = ((x/(long)Math.pow(10,i+1))*10+digit)*(long)Math.pow(10,i)+(x%(long)Math.pow(10,i));
            }
        }
        System.out.println(x);
    }
}
