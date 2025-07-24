public class Vehicle {
    private int vehicle_ID;
    private String brand_name;
    private int price;

    private static int count = 0;

    public Vehicle(int vehicle_ID, String brand_name, int price){
        this.vehicle_ID = vehicle_ID;
        this.brand_name = brand_name;
        this.price = price;
        count++;
    }

    public static int getCount(){
        return count;
    }


    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(101,"Mahindra", 2000000);
        Vehicle vehicle2 = new Vehicle(102,"Honda", 1500000);
        Vehicle vehicle3 = new Vehicle(103,"Toyota", 1000000);
        System.out.println("Total number of vehicles created: " + Vehicle.getCount());

    }
}
