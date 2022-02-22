public class Gram implements Unit {

    private static Gram instance = null;

    @Override
    public double conversionFactor() {
        return 1000;
    }

    public static Gram getInstance() {
        if (instance == null) {
            instance = new Gram();
        }
        return instance;
    }
}
