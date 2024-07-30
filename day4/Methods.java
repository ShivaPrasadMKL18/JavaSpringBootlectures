package day4;

public class Methods {

    String STATUS = "Completed";
    static String STATIC_STATUS = new String("Completed");

    public static void main(String[] args) {
        Methods method = new Methods();
        method.addition();
        method.addition(1, 2);
        method.addition(1, 2, 3);

        System.out.println(method.getName());
        System.out.println(getName("Info"));

        System.out.println(method.STATUS);

        System.out.println(getName("Info", "Info1"));

        System.out.println(STATIC_STATUS);
    }

    // Methods : Block of statements that can perform a specfic task
    // Methods can have a return type or it should void by defualt.

    // Static and non static methods
    // static : should only be called from or by static methods
    // non static : should create a object and then use it.

    // Syntax : [access Modifier] returnType methodName (parameters...)
    // parameters or Arguments : (identifier) (4 - 5 parameters) (if more than that
    // then create objects)
    // access Modifier : public, private, protected and default -- next sessions

    public void addition() {

    }

    // method overloading
    public int addition(int a, int b) {
        return a + b;
    }

    // method overloading
    public float addition(float a, float b, float c) {
        addition();
        System.out.println(STATUS);
        System.out.println(STATIC_STATUS);
        return a + b + c;
    }

    public static String getName() {
        System.out.println(STATIC_STATUS);
        return "Information";
    }

    public static String getName(String a) {
        getName();
        return "Information " + a;
    }

    public static String getName(String a1, String a2) {
        System.out.println();
        return "Information " + a1 + " " + a2;
    }
}
