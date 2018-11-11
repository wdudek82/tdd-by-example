package guru.springframework;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Franc) {
                return ((Franc) obj).amount == getAmount();
            }
        }
        return false;
    }
}
