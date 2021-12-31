package Day3;

public class TestString7 {
    public static void main(String args[]) {
        String x = "Love";
        String y = "You";
        SwapString(x,y);
    }
    public static void SwapString(String a, String b) {
        System.out.println("Before : " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
    }
}
