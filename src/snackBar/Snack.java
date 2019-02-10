package snackBar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack (
        String name,
        int quantity,
        double cost,
        int vendingMachineId
    )
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int toAdd)
    {
        this.quantity += toAdd;
    }

    public void buySnack(int quantity)
    {
        if (quantity <= this.quantity)
        {
            this.quantity -= quantity;
        }
        else
        {
            System.out.println(
                "You want to buy " + quantity + " of " + this.name + ",\n" +
                "but there are only " + this.quantity + " of " + this.name + "\n"
            );
        }
    }

    public double getTotalCost(int quantity)
    {
        return quantity * this.cost;
    }
}
