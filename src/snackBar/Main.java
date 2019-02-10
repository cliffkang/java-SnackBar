package snackBar;

public class Main
{
    private static void buyAndLog(Customer c, Snack s, int quantity)
    {
        System.out.println(
            c.getName() + " started with $" + c.getCashOnHand() + " and there were " + s.getQuantity() + " units of " + s.getName() + " on hand.\n" +
            c.getName() + " then bought " + quantity + " units of " + s.getName() + " at $" + s.getTotalCost(1) + " each.\n"
        );
        s.buySnack(quantity);
        c.buyFor(s.getTotalCost(quantity));
        System.out.println(c.getName() + "\'s cash on hand post-purchase: " + c.getCashOnHand());
        System.out.println("Quantity of " + s.getName() + " left: " + s.getQuantity() + "\n");
    }

    private static void foundMoney(Customer c, double cashFound)
    {
        c.addCash(cashFound);
        System.out.println(c.getName() + " found $" + cashFound + " and now has " + c.getCashOnHand() + "\n");
    }

    private static void restock(Snack s, int quantity)
    {
        s.addQuantity(quantity);
        System.out.println(
            s.getName() + " was just restocked with " + quantity + " more units \n" +
            "and now there are " + s.getQuantity() + " units left.\n"
        );
    }

    private static void snackBarLogs()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack f1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack f2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack f3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack d1 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack d2 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("\n");
        buyAndLog(c1, d1, 3);
        buyAndLog(c1, f3, 1);
        buyAndLog(c1, d1, 2);
        foundMoney(c1, 10.00);
        buyAndLog(c1, f2, 1);
        restock(f3, 12);
        buyAndLog(c2, f3, 3);
    }

    public static void main(String[] args)
    {
        snackBarLogs();
    }
}