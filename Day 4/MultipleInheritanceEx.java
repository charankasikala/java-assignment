class A{
    void show(){
        System.out.println("Displaying A class");
    }
}
class B{
    void show(){
        System.out.println("Displaying B class");
    }
}
class C extends A, B{   // Error Multiple Inheritance
    void display(){
        System.out.println("Displaying C class");
    }
}

public class MultipleInheritanceEx{
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
    }
}