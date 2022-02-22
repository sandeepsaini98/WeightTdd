public interface Unit {

    double conversionFactor();

    default double convertToBase(double value) {
        return value * conversionFactor();
    }
}
