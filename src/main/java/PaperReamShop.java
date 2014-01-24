public class PaperReamShop {

    public double computePrice(int quantity, double reamPrice) {
        return computePrice(quantity, reamPrice, TaxByCountry.FR);
    }

    public double computePrice(int quantity, double reamPrice, TaxByCountry taxByCountry) {
        double discount = computeDiscount(quantity);
        return quantity * reamPrice * (1 + taxByCountry.getTax()) * discount;
    }

    private double computeDiscount(int quantity) {
        double discount = 1;
        if (quantity >= 100) {
            discount = 0.95;
        }
        if (quantity >= 400) {
            discount = 0.93;
        }
        return discount;
    }

}
