public class StaticblockExample {
    static int a = 3;
    static int b;

    static{
        System.out.println("I am in static block");
        b = a * 3;
    }
    static class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
}
    public static void main(String[] args) {
        // System.out.println(StaticblockExample.b);
        Test a = new Test("Abhishek");
        Test b = new Test("Abhi");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}