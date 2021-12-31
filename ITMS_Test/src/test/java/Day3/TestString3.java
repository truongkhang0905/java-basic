package Day3;

public class TestString3 {
    public static void main(String[] args)
    {
        String str = "The Walking Dead";
        SubString(str);
        ToUpperCase(str);
        ToLowerCase(str);
    }
    public static void SubString(String str) {


        // Get a substring of the above string starting from
        // index 10 and ending at index 26.
        String new_str = str.substring(4, 9);

        // Display the two strings for comparison.
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }
    public static void ToUpperCase(String str) {
        String upper_str = str.toUpperCase();

        // Display the two strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }
    public static void ToLowerCase(String str) {
        String lower_str = str.toLowerCase();

        // Display the two strings for comparison.
        System.out.println("String in uppercase: " + lower_str);
    }
}
