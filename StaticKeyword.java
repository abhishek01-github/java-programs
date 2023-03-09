public class StaticKeyword {
    static int a = 5;
    public static void main(String[] args) {
        System.out.println(a);
        a=6;
        System.out.println(a);
    }
    static {
        System.out.println(a);
    }
}