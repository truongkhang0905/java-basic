package Day1;

public class Test1 {
    // HoanViHaiSo
        public static void main (String[] args)
        {
            // cach 1: su dung bien temp
            int a = 1;
            int b = 2;
            int temp;
            temp = a;
            a = b;
            b = temp;
            System.out.println("Sau khi hoán đổi\na = " + a + "\nb = " + b);

            //cach 2: dung phep toan cong & tru
            int x = 4;
            int y = 6;
            x = x-y;
            y = x+y;
            x = y-x;
            System.out.println("Sau khi hoán đổi\nx = " + x + "\ny = " + y);
        }
    }

