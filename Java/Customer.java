public class Customer {
    public static void main(String[] args) {
        System.out.println("Customer Variable Declaration/Initialization/Accessing");
        int custId;
        String custName;
        String serviceRequired;
        char group;
        float amountPaid;

        // Initialization
        custId = 101;
        custName = "Harsh";
        serviceRequired = "Electronic Phone";
        group = 'A';
        amountPaid = 80000.25f;

        // Accessing the variables
        System.out.println("Customer ID: " + custId);
        System.out.println("Customer Name: " + custName);
        System.out.println("Service Required: " + serviceRequired);
        System.out.println("Customer Group: " + group);
        System.out.println("Amount Paid: " + amountPaid);

    }
}
