import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees");
        float a = input.nextFloat();
        System.out.println("According to latest changes: Rs." + a +"= $" + String.format("%.2f",(a/80.5)));
    }
}