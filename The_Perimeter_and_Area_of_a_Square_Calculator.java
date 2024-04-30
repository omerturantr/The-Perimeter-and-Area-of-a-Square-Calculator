import java.util.Scanner;

public class perimeterAndareaCalculator {
    public static void main(String[] args) {
        double sideLength;
        double perimeter, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the SIDE LENGTH of the Square: ");     sideLength = input.nextFloat();

        perimeter = sideLength * 4;
        area = sideLength * sideLength;

        System.out.println("The PERIMETER of the Square is " + perimeter + " meters.");
        System.out.println("The AREA of the Square is " + area + " square meters.");
    }
}
