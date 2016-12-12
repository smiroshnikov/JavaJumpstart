public class Program {
    public static void printTextMoreTimes(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);

        }
    }

    public static void main(String[] args) {
        Rectangle ob = new Rectangle(3, 4);
        System.out.println(ob.area());
        printTextMoreTimes("Java is very nice!", 2);
        String fistName = "Sergei";
        boolean isSergei = fistName.equals("Sergei");
        System.out.println(isSergei);
        System.out.println(fistName.equalsIgnoreCase("SERGEI"));
        String someWords = "A bunch of Words ! ";
        System.out.println("someWords contain 'bunch' = " + someWords.contains("bunch"));
        System.out.println("This is chained method " + someWords.toLowerCase().contains("words"));
        boolean coolExample = false || false || true;
        System.out.println("coolExample is always  " + coolExample);
    }
}
