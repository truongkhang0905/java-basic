package Day3;
import java.util.Scanner;
public class TestString4 {
        public static void main(String[] args) {
          ReverseString();
        }
        public static void ReverseString() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a string: ");
            char[] letters = scanner.nextLine().toCharArray();
            System.out.print("Reverse string: ");
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
            System.out.print("\n");
        }
    }
