import java.util.*;
public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next().trim();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<s.length();i+=2){
            ls.add(s.charAt(i)-48);
        }
        Collections.sort(ls);
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i));
            if(i!= ls.size()-1)
            System.out.print("+");
        }
    }
}