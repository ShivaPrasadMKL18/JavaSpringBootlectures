package day1;
public class FirstProgram {

    // primitive Datatypes
    int a = 1; // address location : 1000
    float b = 2.15f;
    boolean flag;
    char c;
    String d1;
    byte by;

    // wrappers class - Datatypes
    Integer a1;
    Float b1 = 3.2f;
    Character c1;
    Byte h;
    Boolean flag1 = false;

    public static void main(String args[]) {
        System.out.println("Hello World");

        // ClassName random-object-name = new ClassName();

        FirstProgram fp = new FirstProgram();
        System.out.println(fp.a + " " + fp.b);
    }
}

// java is a compiled lang.
// javac FirstClass.java
// java FirstClass