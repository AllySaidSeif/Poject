
/**
 * Write a description of class itemTest here.
 *
 * @author (Ally-BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
public class itemTest
{
    public static void main(String[]args)
    {
        stockItem man = new stockItem(2,"Anna",56.14,23);
        System.out.println("Initial details:" + man);
        man.setPrice(62.42);
        man.addToStock(10);
        System.out.println("Updated details:" + man);
        double totalValue = man.calculateTotalValue();
        System.out.println("Total value of items in Stock is:" + totalValue);
    }
}
