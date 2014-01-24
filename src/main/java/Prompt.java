import java.util.Scanner;

public class Prompt {

    public static void main(String[] args) {
        System.out.println("WARNING THE PRICE GIVEN MAY NOT BE RIGHT");
        System.out.println("USE AT YOUR OWN RISLK");
        System.out.println("WE CAN NOT BE LIABLE UPON USAGE OF THIS PRICE IS REAL QUOTES...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantity of ream");
        int quantity = scanner.nextInt();
        System.out.println("Price of 1 ream");
        double reamPrice = scanner.nextDouble();
        System.out.println("Country Code");
        String countryCode = scanner.next();
        System.out.println(new PaperReamShop().computePrice(quantity, reamPrice, TaxByCountry.valueOf(countryCode)));
    }
}
