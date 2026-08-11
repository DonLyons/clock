public class Stopwatch {
    private ClockHand milliseconds;
    private ClockHand seconds;
    private ClockHand minutes;

    public Stopwatch() {
        milliseconds = new ClockHand(100);
        seconds = new ClockHand(60);
        minutes = new ClockHand(60);
    }

    // Increase time and advance seconds/minutes if a limit is reached
    public void advance() {
        this.milliseconds.advance();
        if (this.milliseconds.value() == 0) {
            this.seconds.advance();
            if (this.seconds.value() == 0) {
                this.minutes.advance();
            } 
        }
    }

    public String toString() {
        return this.minutes + ":" + this.seconds + ":" + this.milliseconds;
    }
}