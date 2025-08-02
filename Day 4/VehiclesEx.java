class Vehicle{
    float mileage;
    double price;

    Vehicle(float mileage, double price){
        this.mileage = mileage;
        this.price = price;
    }

    void display(){
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);

    }
}

class Car extends Vehicle{
    double ownership_cost;
    int warranty;
    int seating_capacity;
    String fuel_type;

    Car(double ownership_cost, int warranty, int seating_capacity, String fuel_type, float mileage, double price){
        super(mileage, price);
        this.ownership_cost = ownership_cost;
        this.warranty = warranty;
        this.seating_capacity = seating_capacity;
        this.fuel_type = fuel_type;
    }

    void display(){
        super.display();
        System.out.println("Owner ship Cost: " + ownership_cost);
        System.out.println("Warranty (in years): " + warranty);
        System.out.println("Seating Capacity: " + seating_capacity);
        System.out.println("Fuel Type: " + fuel_type);

    }

}

class Bike extends Vehicle{
    int no_of_cylinders;
    int no_of_gears;
    String coolingType;
    String wheelType;
    float fuelTankSize;

    Bike(int no_of_cylinders, int no_of_gears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
        super(mileage, price);
        this.no_of_cylinders = no_of_cylinders;
        this.no_of_gears = no_of_gears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }

    void display(){
        super.display();
        System.out.println("Number Of Cylinders: " + no_of_cylinders);
        System.out.println("Number of gears: " + no_of_gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size (in Inches): " + fuelTankSize);
    }
}

class Audi extends Car{
    String modelType;

    Audi(String modelType, double ownership_cost, int warranty, int seating_capacity, String fuel_type, float mileage, double price){
        super(ownership_cost, warranty, seating_capacity, fuel_type, mileage, price);
        this.modelType = modelType;
    }

    void display(){
        System.out.println("Audi Car Specifications:");
        super.display();
        System.out.println("Model Type: " + modelType);
        System.out.println();
    }
}

class Ford extends Car{
    String modelType;
    Ford(String modelType, double ownership_cost, int warranty, int seating_capacity, String fuel_type, float mileage, double price){
        super(ownership_cost, warranty, seating_capacity, fuel_type, mileage, price);
        this.modelType = modelType;
    }

    void display(){
        System.out.println("Ford Car Specifications:");
        super.display();
        System.out.println("Model Type: " + modelType);
        System.out.println();
    }
}

class Bajaj extends Bike{
    String make_type;

    Bajaj(String make_type, int no_of_cylinders, int no_of_gears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
        super(no_of_cylinders, no_of_gears, coolingType, wheelType, fuelTankSize, mileage, price);
        this.make_type = make_type;
    }

    void display(){
        System.out.println("Bajaj Bike Specifications:");
        super.display();
        System.out.println("Make Type: " + make_type);
        System.out.println();
        
    }
}

class TVS extends Bike{
    String make_type;

    TVS(String make_type, int no_of_cylinders, int no_of_gears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
        super(no_of_cylinders, no_of_gears, coolingType, wheelType, fuelTankSize, mileage, price);
        this.make_type = make_type;
    }

    void display(){
        System.out.println("TVS Bike Specifications:");
        super.display();
        System.out.println("Make Type: " + make_type);
        System.out.println();
    }
}
public class VehiclesEx {
    public static void main(String[] args) {
        Audi ad = new Audi("Audi SUV", 1000000, 6, 6, "Deisel", 30.4f, 1100000);
        Ford fd = new Ford("F-150", 700000, 4, 4, "Petrol", 23.8f, 800000);
        Bajaj bj = new Bajaj("MotorCycle", 1, 4, "Oil", "spokes", 8.5f, 15.3f, 100000);
        TVS tv = new TVS("EXCEL", 1, 0, "Oil", "Alloy", 5.2f, 10, 40000);

        ad.display();
        fd.display();
        bj.display();
        tv.display();
    }
}


/*
 * We want to store the information about different vehicles.
 *  Create a class named Vehicle with two data member named mileage and price.
 *  Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), 
seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, 
cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size
(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to 
store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the
 make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type,

ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the
 same for a Bajaj and a TVS bike.
 */