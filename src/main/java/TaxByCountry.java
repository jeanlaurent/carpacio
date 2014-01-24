public enum TaxByCountry {
    FR(.20), ES(.21), IT(.22), PL(.23);

    private final double tax;

    TaxByCountry(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
