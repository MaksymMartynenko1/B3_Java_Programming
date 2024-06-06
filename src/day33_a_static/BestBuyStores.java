package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        day33_a_static.BestBuy store1 = new day33_a_static.BestBuy("Fairfax, VA");
        day33_a_static.BestBuy store2 = new day33_a_static.BestBuy("Bergenfield, NJ");
        day33_a_static.BestBuy store3 = new day33_a_static.BestBuy("Boston, MA");


        //System.out.println(BestBuy.location); // NOT VALID -for instance variable
        System.out.println(day33_a_static.BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        store1.headquarters = "Tysons, 123 Test St, VA, United States";
        System.out.println(day33_a_static.BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);


        System.out.println();
        store3.headquarters = "Chantilly, 987 Check Dr, VA, United States";
        store3.location = "Manhattan, NY";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headquarters); // We can still call static by object reference but it is not good practice.
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(day33_a_static.BestBuy.headquarters); // Anything static should be called by Class name

        System.out.println("--------------------------------------------");
        store1.openStore();
        store2.openStore();
        store3.openStore();


        System.out.println("--------------------------------------------");
        day33_a_static.BestBuy.reStock();
        store1.reStock(); // You still can call static method by object reference but not good practice
        System.out.println(store1.numOfCompOnSpecialDay);
        System.out.println(store2.numOfCompOnSpecialDay);
        System.out.println(store3.numOfCompOnSpecialDay);


    }
}
