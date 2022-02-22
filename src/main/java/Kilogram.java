public class Kilogram implements Unit {
    private static Kilogram instance = null;

    @Override
    public double conversionFactor() {
        return 1000000;
    }

    public static Kilogram getInstance() {
        if (instance == null) {
            instance = new Kilogram();
        }
        return instance;
    }
}
