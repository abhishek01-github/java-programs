import java.util.*;
public class B_Settlement_of_Guinea_Pigs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int aviary = 0;
            int pigs=0;
            int n = input.nextInt();
            int a = 0;
            while(n>0){
                if(input.nextInt()==1){
                    pigs++;
                    if(a==0)
                    aviary++;
                    else
                    a--;
                }
                else{
                    if((pigs/2)+1<aviary){
                        a = aviary - ((pigs/2)+1);
                    }else if((pigs/2)+1>aviary)
                    {
                        if(aviary>0)
                        aviary = (pigs/2)+1;
                    }
                }
                n--;
            }
            System.out.println(aviary);
            t--;
        }
    }
}