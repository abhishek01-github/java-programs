import java.util.Scanner;
public class StaticVariable {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        fun();
        System.out.println(x);
    }
    static void fun(){
        System.out.println(x);
        x=40;
    }
}