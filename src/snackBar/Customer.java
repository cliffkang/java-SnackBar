package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double cashToAdd)
    {
        this.cashOnHand += cashToAdd;
    }

    public void buyFor(double totalCost)
    {
        if (totalCost <= this.cashOnHand)
        {
            this.cashOnHand -= totalCost;
        }
        else
        {
            System.out.println(
                "Your purchase would cost " + totalCost + ",\n" +
                "but you only have " + this.cashOnHand + "\n"
            );
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return this.cashOnHand;
    }
}