public class Test2 {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
         x = 40;
        System.out.println(x);
        getX();
    }

    public static void getX() {
        System.out.println(x);
    }
}