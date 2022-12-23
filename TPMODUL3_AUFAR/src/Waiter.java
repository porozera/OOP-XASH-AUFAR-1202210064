public class Waiter implements Runnable{
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiter(int orderQty, int customerID){
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    @Override
    public void run(){
        while(true){
            makeFood();
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty + foodPrice);
        System.out.println("==========================================================");
    }

    public void makeFood(){
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Coffee is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);


            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the kitchen to make another food\n");

        }
    }
}
