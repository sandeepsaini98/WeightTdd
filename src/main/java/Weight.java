public class Weight {
    private final double value;

    protected Unit unit;

    protected Weight(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Weight that)) {
            return false;
        }
        double thatValueConvertedToBase = that.unit.convertToBase(that.value);
        return unit.convertToBase(this.value) == thatValueConvertedToBase;
    }

    public Weight sum(Weight obj) {
        double sum = this.unit.convertToBase(this.value) + obj.unit.convertToBase(obj.value);
        return new Weight(sum / this.unit.conversionFactor, this.unit);
    }
}
