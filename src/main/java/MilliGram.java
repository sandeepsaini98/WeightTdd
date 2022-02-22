public class MilliGram implements Unit {
    private static MilliGram instance = null;

    @Override
    public double conversionFactor() {
        return 1;
    }

    public static MilliGram getInstance() {
        if (instance == null) {
            instance = new MilliGram();
        }
        return instance;
    }
}
