package Day3;

public class TestString1 {
    public static void main(String[] args) {
        CompareTo();
    }
    public static void CompareTo() {
        String s1 = "Hello";
        String s2 = "HELLO";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
