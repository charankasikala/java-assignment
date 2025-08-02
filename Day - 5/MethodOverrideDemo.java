class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

    private void privateMethod() {
        System.out.println("Parent's private method");
    }

    static void staticMethod() {
        System.out.println("Parent's static method");
    }

    final void finalMethod() {
        System.out.println("Parent's final method");
    }

    void callPrivateMethod() {
        privateMethod();
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }

    private void privateMethod() {
        System.out.println("Child's private method");
    }

    static void staticMethod() {
        System.out.println("Child's static method");
    }

    // Uncommenting below method will cause compile-time error
    // because final methods cannot be overridden
    /*
    void finalMethod() {
        System.out.println("Attempt to override final method");
    }
    */
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Parent obj = new Child(); 

        System.out.println("Calling constructor:");

        System.out.println("Calling static method:");
        obj.staticMethod();

        System.out.println("Calling final method:");
        obj.finalMethod(); 

        System.out.println("Calling private method via public method:");
        obj.callPrivateMethod(); 
    }
}
