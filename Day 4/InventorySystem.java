import java.util.ArrayList;

class Store{
    static String storeName;
    static String storeLocation;

    static void setStoreDetails(String name, String location){
        storeName = name;
        storeLocation = location;
    }

    ArrayList<Product> ar = new ArrayList<>();

    static void displayStoreDetails(){
        System.out.println("Store name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("===============================");
    }

    void addProduct(Product product){
        ar.add(product);
    }

    void displayAllProducts(){
        System.out.println("All Product Details");
        for(Product p: ar){
            p.displayProduct();
        }
    }
}

class Product{
    private int productID;
    private String name;
    private double price;
    private int quantity;

    public Product(int productID, String name, double price, int quantity){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct(){
        System.out.println("Product Id: " + productID);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: Rs. " + price);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("-------------------------------------");
    }

}

public class InventorySystem{
    public static void main(String[] args) {
        Store.setStoreDetails("JIO MART", "PONNUR");
        Store.displayStoreDetails();

        Store store = new Store();

        Product pr1 = new Product(123, "Fridge", 40000, 2);
        store.addProduct(pr1);
        Product pr2 = new Product(146, "Laptop", 100000, 12);
        store.addProduct(pr2);
        store.displayAllProducts();
    }   
    
}