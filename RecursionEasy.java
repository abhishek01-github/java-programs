import java.io.*;
import java.util.*;

public class RecursionEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }

    static void fun(int n) {
        if (n == 0)
            return;
        fun(n - 1);
        System.out.println(n);
    }
}