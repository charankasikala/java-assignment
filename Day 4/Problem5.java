class Shape{
    void display(){
        System.out.println("This is a shape");
    }
}
class Polygon extends Shape{
    void display(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon{
    void display(){
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon{
    void display(){
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle{
    void display(){
        System.out.println("Square is a Rectangle");
    }
}

public class Problem5{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();
        Polygon poly = new Polygon();
        poly.display();
        Rectangle rect = new Rectangle();
        rect.display();
        Triangle tri = new Triangle();
        tri.display();
        Square sq = new Square();
        sq.display();
    }
}