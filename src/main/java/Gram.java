public class Gram extends Unit {

    private static Gram instance = null;

    private Gram() {
        super(1000);
    }

    public static Gram getInstance() {
        if (instance == null) {
            instance = new Gram();
        }
        return instance;
    }
}
