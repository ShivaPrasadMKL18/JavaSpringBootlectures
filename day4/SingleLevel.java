package day4;

import day4.GreenApples;

// Class : A class is a template. Eg : Fruits, Veggies
// Object : A objeect is a blue print/ instance of a class. 
// Eg: Class : Fruits - Objects : Apples, bananas, etc
// Eg: Class : Veggies - Onion, Potato

// Inheritance - Aquiring the qualities of parents/ ancestors, etc
// extends is a key word
// Single Inheritance
 
public class SingleLevel{
    public static void main(String[] args) {
        GreenApples ga = new GreenApples();
        System.out.println(ga.greenColored());
        System.out.println(ga.seeds());
    }
}
