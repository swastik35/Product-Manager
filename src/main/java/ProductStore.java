import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductStore {
    List<Product> PS = new LinkedList<>();
    String Name;
    Double Price;
    int Stock;
    Scanner sc = new Scanner(System.in);
    public void inStoreItems() {
        String[] productNames = {"Lux Soap", "Fair n Lovely", "MTR"};
        Double[] productPrice = {40.00d, 60.00d, 30.00d};
        Integer[] stock = {10, 6, 10};

        for (int i = 0; i < productNames.length; i++) {
            PS.add(new Product(productNames[i], productPrice[i], stock[i]));
        }
    }

    public void getItemList () {
        for (int i = 0; i < PS.size(); i++) {
            System.out.println(PS.get(i));
        }
    }
    public void AddItemToStore(String Name, Double Price, int Stock){
        PS.add(new Product(Name,Price,Stock));
    }
    public void AddItem(){
        try {
            System.out.print("Enter Product Name: ");
            Name = sc.nextLine();
            System.out.print("Enter Product Price: ");
            Price = sc.nextDouble();
            System.out.print("Enter Product Stock: ");
            Stock = sc.nextInt();
            AddItemToStore(Name,Price,Stock);
        } catch (Exception e){
            System.out.println("Input Mismatch... Please enter valid input.");
        }

    }
    public void RemoveProductByName() {
        System.out.print("Enter Product Name to remove: ");
        Name = sc.next();
        Iterator<Product> iterator = PS.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(Name)) {
                iterator.remove();
            }
        }
    }
}
