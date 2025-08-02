class TwoD{
    int x;
    int y;

    TwoD(){
        System.out.println("Default TwoD Constructor");
        x = 0;
        y = 0;
    }

    TwoD(int x, int y){
        System.out.println("TwoD constructor with 2 args");
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}

class ThreeD extends TwoD{
    int z;

    ThreeD(){
        super();
        z = 0;
    }

    ThreeD(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public double distance(ThreeD other){
        return Math.sqrt(Math.pow(this.x- other.x, 2) + 
                        Math.pow(this.y - other.y, 2) +
                        Math.pow(this.z - other.z, 2));
        
    }

    public void display(){
        System.out.println("X: " + x + " , " + "Y: " + y + " , " + "Z: " + z);
    }

}

public class Problem2{
    public static void main(String[] args) {
        ThreeD obj1 = new ThreeD();
        obj1.setX(1);
        obj1.setY(2);
        obj1.setZ(3);

        ThreeD obj2 = new ThreeD(4, 5, 6);

        System.out.println("Display Point 1:");
        obj1.display();

        System.out.println("Display Point 2:");
        obj2.display();

        System.out.println("Distance Btw 2 Points");
        System.out.println(obj1.distance(obj2));
    }
}

/*
 * Construct a base class called twoD contains x and y
 *  and methods to read and write the x and y. Create 
 * another class called threeD which is derived from twoD
 *  and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with
three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with
 a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message 
"TwoD constructor with two arguments"
 */