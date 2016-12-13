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

    public void drive() {
        lapsDriven += 1;
        barCount -= 1;
    }

}
