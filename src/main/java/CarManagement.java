public class CarManagement {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Mercedes", 12000, 2500, 3500);
        System.out.println("This is new truck, this is: " + lorry.trade);
        System.out.println("It's weight is: " + lorry.getWeight());
        System.out.println("The power of new truck is: " + lorry.getPwr() + " horsepowers.");
        System.out.println("It's useful payload is: " + lorry.getLoad() + " kilograms.");

        //RENAME THE CARMAKER AND PAYLOAD

        lorry.newTrade("Mercedes_updated");
        lorry.newWeight(10000);
        System.out.println();
        System.out.println();
        System.out.println("THIS IS UPDATED TRUCK PARAMETERS:");
        System.out.println("This is Updated truck, this is: " + lorry.trade);
        System.out.println("It's Advanced useful payload is: " + lorry.getLoad() + " kilograms.");

    }
}
