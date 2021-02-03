import java.util.Scanner;

//The formula for the area of a rectangle is S = a*b
//The formula for the rectangle circumference is P = 2*a + 2*b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int area = a * b;
        int circumference = 2 * a + 2 * b;

        System.out.print("Rectangle area = ");
        System.out.println(area);
        System.out.print("Rectangle circumference = ");
        System.out.println(circumference);
    }
}

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("Number is equal to zero!");
        } else if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}

