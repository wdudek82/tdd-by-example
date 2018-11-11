package guru.springframework;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Dollar) {
                return ((Dollar) obj).amount == getAmount();
            }
        }
        return false;
    }
}
