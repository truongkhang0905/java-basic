package Day2;

public class DivideNumber {
    public static void main (String[] args){
        int i=1;
        System.out.println("Result");
        Print_Result(i);

    }
    public static void Print_Result(int i) {
        while (i < 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
