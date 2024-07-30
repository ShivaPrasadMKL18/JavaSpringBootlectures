package day1;
public class TypeCasting {
    public static void main(String[] args) {

        String a = "10000";
        int b = Integer.parseInt(a);
        System.out.println(b);

        float c = Float.parseFloat(a);
        System.out.println(c);

        int d = 12;
        String a1 = String.valueOf(d);
        System.out.println(a1);
    }
}
