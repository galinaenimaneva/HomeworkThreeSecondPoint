import java.util.Scanner;
//The formula for the area of a rectangle S=a*b
public class Main {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("a = ");
            int a = scanner.nextInt();
         System.out.print("b = ");
         int b = scanner.nextInt();
            int area = a * b;

            System.out.print("Rectangle area = ");
            System.out.println(area);
        }
    }
