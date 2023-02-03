import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which perimeter you want to calculate");
        String perimeter = in.next();
        switch (perimeter){
            case "circle":
                System.out.println("Enter the radius of the circle");
                System.out.println(2*Math.PI*in.nextFloat());
                break;
            case "triangle":
                System.out.println("Enter the sides of the triangle");
                System.out.println(in.nextFloat()+ in.nextFloat()+ in.nextFloat());
                break;
            case "rectangle":
                System.out.println("Enter the length and breadth of the rectangle");
                System.out.println(2*(in.nextFloat())+ in.nextFloat());
                break;
            case "parallelogram":
                System.out.println("Enter the parallel sides of parallelogram");
                System.out.println(2*(in.nextFloat())+ in.nextFloat());
                break;
            case "square":
                System.out.println("Enter the side of the square");
                System.out.println(4* in.nextFloat());
                break;
            case "rhombus":
                System.out.println("Enter the side of rhombus");
                System.out.println(4* in.nextFloat());
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}