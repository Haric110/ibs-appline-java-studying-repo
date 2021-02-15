import Sweets.Sweets;
import Sweets.Chocolate;
import Sweets.Cookies;

import java.util.ArrayList;

public class Source {
    public static void main(String[] args) {
        ArrayList<Sweets> gift = new ArrayList<>();
        double giftTotalPrice = 0.0;
        int giftTotalWight = 0;


        Chocolate alpenGold = new Chocolate(
                "Alpen Gold",
                299.99,
                195,
                0.85);
        gift.add(alpenGold);

        Chocolate babaevsky = new Chocolate(
                "Бабаевский",
                259.99,
                190,
                0.75);
        gift.add(babaevsky);

        Cookies someCookies = new Cookies(
                "Some Cookies!",
                300,
                100.00,
                "shortbread");
        gift.add(someCookies);

        System.out.println("The gift content: ");

        for (Sweets giftEntry : gift) {
            giftTotalWight += giftEntry.getWeightInGrams();
            giftTotalPrice += giftEntry.getPrice();

            System.out.println(giftEntry.toString());
        }

        System.out.printf("Weight of the gift: %d g\n", giftTotalWight);
        System.out.printf("Total price of the gift: %.2f RUB\n", giftTotalPrice);
    }
}
