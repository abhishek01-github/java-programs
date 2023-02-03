import java.util.Scanner;
class Greeting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Hello! "+ input.next());
    }
}