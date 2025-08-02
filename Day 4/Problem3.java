import java.util.Scanner;

class Point{
    private int x;
    private int y;
    public Point(){
        x = 0;
        y = 0;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void printPoint(){
        System.out.println("(" + x + " , " + y + ")");
    }
}

class Circle extends Point{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public void setRadius(double r){
        if(r > 0){
            radius = r;
        }
        else{
            radius = 1.0;
        }
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return 3.14 * radius * radius;
    }
}

public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle();
        circle.setPoint(x, y);
        circle.setRadius(radius);

        System.out.print("Circle center is: ");
        circle.printPoint();

        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Area is " + circle.area());

    }
}


