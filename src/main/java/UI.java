import java.util.Scanner;

public class UI {
    private int ch = 0;
    Scanner sc = new Scanner(System.in);
    ProductStore StoreObj = new ProductStore();

    public UI () {
        menu();

    }
    public void menu(){
        StoreObj.inStoreItems();
        do {
            choice();
            UserInput();
            switch (ch){
                case 1:
                    StoreObj.getItemList();
                    break;
                case 2:
                    StoreObj.AddItem();
                    break;
                case 3:
                    StoreObj. RemoveProductByName();
                    break;
                default:

                    break;
            }
        } while (ch !=0);
    }
    public void UserInput(){
        try {
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();
        } catch (Exception e){
            System.out.println(e+ "!!!!!!!!Please enter relevant Number!!!!!!!!!");
        }

    }

    public void choice(){
        System.out.println("-------------------------------------------");
        System.out.println("\n\n1. Display Store Products");
        System.out.println("2. ADD Store Product");
        System.out.println("3. Remove Store Product");
        System.out.println("0. Exit\n\n");
        System.out.println("-------------------------------------------");
    }


}
