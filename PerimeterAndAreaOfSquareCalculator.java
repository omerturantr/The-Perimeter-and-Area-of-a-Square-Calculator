import java.util.Scanner;

public class PerimeterAndAreaOfSquareCalculator {
    public static void main(String[] args) {
        double sideLengthOfTheSquare;
        double perimeterOfTheSquare, areaOfTheSquare;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the SIDE LENGTH of the Square: ");     sideLengthOfTheSquare = input.nextFloat();

        perimeterOfTheSquare = sideLengthOfTheSquare*4;
        areaOfTheSquare = sideLengthOfTheSquare*sideLengthOfTheSquare;

        System.out.println("The PERIMETER of the Square is " + perimeterOfTheSquare + " meters.");
        System.out.println("The AREA of the Square is " + areaOfTheSquare + " square meters.");
    }
}