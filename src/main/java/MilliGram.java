public class MilliGram extends Unit {
    private static MilliGram instance = null;

    private MilliGram() {
        super(1);
    }

    public static MilliGram getInstance() {
        if (instance == null) {
            instance = new MilliGram();
        }
        return instance;
    }
}
