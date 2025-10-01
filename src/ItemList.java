import java.util.ArrayList;
public class ItemList {

    String itemname;
    int Stock;
    int Price;
    int Sold;

    private ItemList(String itemname, int Stock, int Price, int Sold) {
        this.itemname = itemname;
        this.Stock = Stock;
        this.Price = Price;
        this.Sold = Sold;
    }

    public void logdetails() {
        System.out.println("Item"+this.itemname);
        System.out.println("Stock"+this.Stock);
        System.out.println("Price"+this.Price);
        System.out.println("Sold"+this.Sold);
    }

    public void buy() {
        if (Stock > 0) {
            Stock = Stock - 1;
            Sold = Sold + 1;
            System.out.println("thank you for buying");
        } else if (Stock == 0) {
            System.out.println("Sorry we are out of stock");
        }
    }
    public void Return() {
        if (Sold > 0) {
            Stock = Stock + 1;
            Sold = Sold - 1;
            System.out.println("RETURNED");
        } else if (Stock == 0) {
            System.out.println("BRUH STOP ALL THE ITEMS ARE RETURNED");
 }
}
    public static void main (String []args) {
        ItemList obj = new ItemList("Notebook", 20, 0, 10);
        ItemList obj2 = new ItemList("Pencils", 10, 0, 10);
        ItemList obj3 = new ItemList("Robust", 20, 0, 10);

        System.out.println("buy 3 item,  return 1");
        obj.logdetails();
        System.out.println("");
        obj.buy();
        obj.buy();
        obj.buy();


        System.out.println("buy 2 item,  return 2");

        obj.logdetails();
        System.out.println("");
        obj.buy();
        obj.buy();
        obj.Return();
        obj.Return();


        System.out.println("Set 5 stocks,  return 3");

        obj2.logdetails();
        System.out.println("");
        obj2.Return();
        obj2.Return();
        obj2.Return();


        System.out.println("Set 1 stocks,  buy 2");
        obj3.logdetails();
        System.out.println("");
        obj3.buy();
        obj3.buy();

    }
}