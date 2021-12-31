package Day3;

public class TestString2 {
    public static void main(String[] args)
    {
        String str1 = "Fighting and ";
        String str2 = "Good Job";
        LengthConcatString(str1, str2);
    }
    public static void LengthConcatString(String str1, String str2) {

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: " + str3);
        int len = str3.length();
        System.out.println("The string length of '"+str3+"' is: "+len);
    }
}
