package day4;

class Apple {
    String seeds() {
        return "Seeds";
    }
}

class GreenApples extends Apple {
    String greenColored() {
        return "greenColored";
    }
}

class Banana extends GreenApples {
    String getsBanana() {
        return "getBanana";
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Banana banana = new Banana();
        System.out.println(banana.greenColored());
        System.out.println(banana.seeds());
        System.out.println(banana.getsBanana());
    }
}