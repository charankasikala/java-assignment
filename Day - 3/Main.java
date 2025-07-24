import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Store.setStoreDetails("JIO Mart", "Guntur");
        Store.displayStoreDetails();
        Store store = new Store();

        Product p1 = new Product(101, "Laptop", 75000.00, 5);
        Product p2 = new Product(102, "Smartphone", 25000.00, 10);
        Product p3 = new Product(103, "Headphones", 1500.00, 20);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        store.displayAllProducts();
    }
}

class Product{
	int ProductID;
	String name;
	double price;
	int quantity;
	
	public Product(int ProductID, String name, double price, int quantity){
		this.ProductID = ProductID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void displayProduct(){
		System.out.println("Product ID: " + ProductID);
		System.out.println("Name: " + name);
		System.out.println("Price: Rs." + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("--------------------------------");
	}
}


class Store{
	public static String storeName;
	public static String storeLocation;
	
	public static void setStoreDetails(String name, String location){
		storeName = name;
		storeLocation = location;
	}
	
	ArrayList<Product> products = new ArrayList<>();


	public static void displayStoreDetails(){
		System.out.println("Store Name: " +storeName);
		System.out.println("Store Location: " +storeLocation);
		System.out.println("==========================");
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public void displayAllProducts(){
		System.out.println("All Products List:");
		System.out.println();
		for(Product p: products){
			p.displayProduct();
		}
	}
	
}

/* Output:
Store Name: JIO Mart
Store Location: Guntur
==========================
All Products List:

Product ID: 101
Name: Laptop
Price: Rs.75000.0
Quantity: 5
--------------------------------
Product ID: 102
Name: Smartphone
Price: Rs.25000.0
Quantity: 10
--------------------------------
Product ID: 103
Name: Headphones
Price: Rs.1500.0
Quantity: 20
--------------------------------

class files created = 3

Product.class
Store.class
Main.class

*/

