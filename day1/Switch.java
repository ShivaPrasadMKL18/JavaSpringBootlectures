package day1;
public class Switch {
    public static void main(String[] args) {

        int age = 40;

        switch (age) {
            case 40:
                System.out.println("Age 40");
                break;
            case 10:
                System.out.println("Age 20");
                break;
            default:
                System.out.println("Default Age : " + age);
        }
    }
}
