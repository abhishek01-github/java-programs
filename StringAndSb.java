import java.util.*;
public class StringAndSb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek Pandey");
        System.out.println(sb);
        sb.replace(8,9," not ");
        System.out.println(sb.toString());
    }
}