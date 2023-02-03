import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which area you want to calculate");
        String area = in.next();
        switch (area){
            case "circle":
            case "Circle":
                System.out.println("Enter the radius");
                float r = in.nextFloat();
                System.out.println("The area of the circle is: " + Math.PI*Math.pow(r,2));
                break;
            case "triangle":
            case "Triangle":
                System.out.println("Enter normal if you know the base and height of the triangle or enter herons if you know the sides of the triangle");
                String tr = in.next();
                switch (tr){
                    case "Normal":
                    case "normal":
                        System.out.println("Enter base and height of the triangle ");
                        System.out.println("The area of the tringle is: "+ 0.5*in.nextFloat()* in.nextFloat());
                        break;
                    case "herons":
                    case "Herons":
                        System.out.println("Enter the sides of the triangle");
                        float a=in.nextFloat();
                        float b=in.nextFloat();
                        float c=in.nextFloat();
                        float s = (a+b+c)/2;
                        System.out.println("The area of the triangle is" +Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                        break;
                    default:
                        System.out.println("Wrong Entry");
                }
                break;
            case "rectangle":
            case "Rectangle":
                System.out.println("Enter the length and breadth of the rectangle");
                System.out.println("The area of the rectangle is: "+ in.nextFloat()* in.nextFloat());
                break;
            case "parallelogram":
            case "Parallelogram":
                System.out.println("Enter the height and base of the parallelogram");
                System.out.println("The area of the parallelogram is: "+ in.nextFloat()*in.nextFloat());
                break;
            case "rhombus":
            case "Rhombus":
                System.out.println("Enter length of the diagonals of rhombus");
                System.out.println("The area of the rhombus is: "+ 0.5* in.nextFloat()* in.nextFloat());
                break;
            default:
                System.out.println("Wrong Entry");
        }
    }
}