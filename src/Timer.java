public class Timer {
    private ClockHand milliseconds;
    private ClockHand seconds;
    private ClockHand minutes;

    public Timer(int minutes, int seconds) {
        this.milliseconds = new ClockHand(100);
        this.seconds = new ClockHand(60, seconds);
        this.minutes = new ClockHand(60, minutes);
    }

    // Decrease time and decrement seconds/minutes if a limit is reached
    public void decrement() {
        this.milliseconds.decrement();
        if (this.milliseconds.value() == 99) {
            this.seconds.decrement();
            if (this.seconds.value() == 59 && this.minutes.value() != 0) {
                this.minutes.decrement();
            }
        }
    }

    public int getMillies() {
        return this.milliseconds.value();
    }

    public int getSeconds() {
        return this.seconds.value();
    }

    public int getMinutes() {
        return this.minutes.value();
    }

    public String toString() {
        return this.minutes + ":" + this.seconds + ":" + this.milliseconds;
    }
}
