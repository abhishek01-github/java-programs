import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("If price of product is less than 500 then no discount, for greater than 500 discount is 10% and for greater than 5000 discount is 20%..");
        System.out.println();
        System.out.println("Enter the Actual Price of product");
        int price = scn.nextInt();
        if(price<500)
            System.out.println("The total price is: "+ price);
        if(price>=500 && price<5000)
            System.out.println("The total price is: " + price*0.90);
        if(price>5000)
            System.out.println("The total price is: " + price*0.80);
    }
}