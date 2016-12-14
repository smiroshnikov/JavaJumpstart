public class GoKart {
    // DON'T FORCE USER TO UNDERSTAND HOW OBJECT WORKS INTERNALLY!
    public final static int MAX_BARS = 8;
    private String color;
    private int barCount;
    private int lapsDriven;

    public GoKart(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void charge() {
        barCount = MAX_BARS;
    }

    public boolean isBatteryEmpty() {
        return barCount == 0;
    }

    public boolean isFullyCharged() {
        return barCount == MAX_BARS;
    }

    public void drive(int laps) {
        int result = lapsDriven + laps;
        if (result > MAX_BARS) {
            throw new IllegalArgumentException("aren't enough bars ! ");
        }
        lapsDriven += laps;
        barCount -= laps;

    }

    public void drive() { // overrides drive method in case no arguments were provided to it
        drive(1);
    }


}
