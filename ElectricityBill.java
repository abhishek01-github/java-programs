import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Electricity bill according to units of electricity used: Rs.10 for first 1-100 units, Rs.15 for 101-250 units and Rs.20 for 251 units onwards..");
        System.out.println();
        System.out.println("Enter the units of electricity used:");
        int bills,units = in.nextInt();
        if(units<100)
            bills=units*10;
        else if(units>100 && units<=250)
            bills=(100*10)+((units-100)*15);
        else
            bills=(100*10)+(150*15)+((units-250)*20);
        System.out.println("Your electricity bill is Rs. "+bills);
    }
}