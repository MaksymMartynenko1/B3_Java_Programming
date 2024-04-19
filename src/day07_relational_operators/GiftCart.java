package day07_relational_operators;
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */
public class GiftCart {
    public static void main (String [] args){
       double giftCardBalance = 200;
       double item1Price = 100;
       double item2Price = 70;
       System.out.println("In my gift card? I heve $" + giftCardBalance);
       System.out.println("Buy item 1 for$" + item1Price + "with you gift card.");

       //giftCardBalance = giftCardBalance - item1Price;
       giftCardBalance -= item1Price;

        System.out.println();





       }



    }


