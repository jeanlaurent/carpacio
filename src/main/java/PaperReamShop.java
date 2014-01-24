public class PaperReamShop {

    public PaperReamShop() {
    }

    public double totalPrice(double reamPrice) {
        return totalPrice(reamPrice, .20);
    }

    public double totalPrice(double reamPrice, double tax) {
        return reamPrice * (1 + tax);
    }


    public double totalPrice(double reamPrice, CountryCode country) {
        if (country == CountryCode.FR) {
            return totalPrice(reamPrice);
        } else if (country == CountryCode.ES) {
            return totalPrice(reamPrice, 0.21);
        } else if (country == CountryCode.IT) {
            return totalPrice(reamPrice, 0.22);
        } else if (country == CountryCode.PL) {
            return totalPrice(reamPrice, 0.23);
        }
        throw new IllegalArgumentException("Unknown country code");
    }

    public double totalPrice(int quantity, double price, CountryCode countryCode) {
        double discount = 1;
        if (quantity >= 100) {
            discount = 0.95;
        }
        if (quantity >= 400) {
            discount = 0.93;
        }
        return quantity * totalPrice(price, countryCode) * discount;
    }
}
