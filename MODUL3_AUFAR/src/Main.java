import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner input = new Scanner(System.in);
    Calculation calculation = new Calculation();
    

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int menu = input.nextInt();

        switch (menu) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double side = input.nextDouble();
            calculation.setSquare(side);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double radius = input.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double a = input.nextDouble();
            System.out.print("Insert the side of the base of the trapezoid : ");
            double b = input.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = input.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        input.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    input.close();
  }
}