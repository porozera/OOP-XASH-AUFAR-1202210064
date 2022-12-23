
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant1 = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Enter how much Food to made: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(restaurant1);
                Waiter waiter = new Waiter(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }
        }

    }

}