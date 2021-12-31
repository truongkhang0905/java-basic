package Day3;

public class TestString6 {
    public static void main(String args[]) {
        int i = 200;
        System.out.println("IntToString");
        IntToString(i);

        String s = "200";
        System.out.println("StringToInt");
        StringToInt(s);
    }
    public static void IntToString(int x) {
        String s = Integer.toString(x);
        System.out.println(s + 100);
    }
    public static void StringToInt(String x) {
        int i = Integer.parseInt(x);
        System.out.println(i + 100);
    }
}
