package Day4;

public class TestArray {
    public static void main(String[] args) {
        int[] NumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum(NumArray);
        Average(NumArray);
        EvenOdd(NumArray);
        Max_Min(NumArray);
    }

    public static void sum(int[] NumArray) {

        int sum = 0;

        for (int i : NumArray) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
    public static void Average(int[] NumArray) {
        double sum = 0;
        double aver;
        for (int i : NumArray) {
            sum += i;
        }
        aver = sum/NumArray.length;
        System.out.println("The sum is " + aver);
    }
    public static void EvenOdd(int[] NumArray) {
        System.out.println("even");
        for (int j : NumArray) {
            if (j % 2 == 0)
                System.out.println(j);
        }

        System.out.println("odd");
        for (int j : NumArray) {
            if (j % 2 != 0)
                System.out.println(j);
        }
    }
    public static void Max_Min(int[] NumArray) {
        int Min = NumArray[0];
        int Max = NumArray[0];

        for (int i = 1; i < NumArray.length; i++) {
            if (NumArray[i] > Max)
                Max = NumArray[i];
            else if (NumArray[i] < Min)
                Min = NumArray[i];
        }

        System.out.println("Largest Number is : " + Max);
        System.out.println("Smallest Number is : " + Min);
    }
}
