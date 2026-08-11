// Base class for timer and stopwatch classes
public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit, int value) {
        this.limit = limit;
        this.value = value;
    }

    public ClockHand(int limit) {
        this(limit, 0);
    }

    // Increase time (tick), reset if upper limit is reached
    public void advance() {
        this.value += 1;;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    // Decrease time (Count down), reset if lower limit is reached
    public void decrement() {
        this.value -= 1;

        if (this.value <= -1) {
            this.value = this.limit - 1;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return String.valueOf(this.value);
        }
    }
}
