package Day2;

public class BangCuuChuong {
    public static void main(String[] args) {
        int num;
        num = 2;
        System.out.println("--------multiplication table-----");
        Print_Result(num);
    }

    public static void Print_Result(int num) {
        int mult_num;
        do {
            mult_num = 1;
            do {
                System.out.println(num + "x" + mult_num + "=" + num * mult_num);
                mult_num++;
            }
            while (mult_num <= 10);

            System.out.println("--------multiplication table-----");
            num++;

        } while (num <= 9);

    }
}
