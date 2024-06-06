public class PrintNumberRecursion {
    public static void main(String[] args) {
        helper1ToN(10);
        helperNTo1(10);
    }
    static void helper1ToN(int num){
        if(num==0)
          return;
        helper1ToN(num-1);
        System.out.println(num);
    }
    static void helperNTo1(int num){
        if(num==0)
          return;
        System.out.println(num);
        helperNTo1(num-1);
    }
}
