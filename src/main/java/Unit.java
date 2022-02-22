public enum Unit {
    KILOGRAM(1000000),GRAM(1000),MILLIGRAM(1);
    final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }
}
