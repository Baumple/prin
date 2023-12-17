package circle;

import java.lang.Math;
import java.util.Scanner;

public class Circle {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        if (radius <= 0) {
            System.out.println("Radius has to be larger than 0!");
            return;
        }

        System.out.println("Area is: " + area(radius));

    }

    public static double area(double r) {
        return Math.PI * r * r;
    }
}
