package day32_custom_classes;

import day33_a_static.Offer;

public class Jobs {
    public static void main(String[] args) {
        Offer o1 = new Offer("Apple", "California");
        System.out.println(o1);

        Offer o2 = new Offer("Microsoft", "Alaska", 120_000.00);
        System.out.println(o2);


    }
}