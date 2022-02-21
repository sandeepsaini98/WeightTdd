public class Kilogram extends Unit {
    private static Kilogram instance = null;

    private Kilogram() {
        super(1000000);
    }

    public static Kilogram getInstance() {
        if (instance == null) {
            instance = new Kilogram();
        }
        return instance;
    }
}
