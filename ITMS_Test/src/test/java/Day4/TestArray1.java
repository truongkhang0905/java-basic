package Day4;

import java.util.Arrays;

public class TestArray1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7};
        int[] numbers1 = {1,2,3,4,6,7};

        Missing(numbers);
        Equality(numbers,numbers1);
    }
    public static void Missing(int[] Num) {
        int total_num = 7;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: Num) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");
    }
    public static void Equality(int[] ary1, int[] ary2) {

        System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary1, ary2));
    }
}
