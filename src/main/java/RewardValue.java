public class RewardValue {
    private double cash;
    private static double factor = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = _getCashValue(miles);
    }

    public int getMilesValue() {
        return (int) (this.cash / factor);
    }

    public double getCashValue() {
        return this.cash;
    }

    private static double _getCashValue(int miles) {
        return miles * factor;
    }
}
