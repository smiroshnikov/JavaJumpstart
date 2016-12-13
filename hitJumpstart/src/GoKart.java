public class GoKart {
    // DON'T FORCE USER TO UNDERSTAND HOW OBJECT WORKS INTERNALLY!
    public final static int MAX_BARS = 8;
    private String color;
    private int barCount;

    public GoKart(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void charge(){
        barCount = MAX_BARS;
    }

}
