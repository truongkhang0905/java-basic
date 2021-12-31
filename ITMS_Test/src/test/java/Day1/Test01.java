package Day1;
import java.util.Scanner;
public class Test01 {
    public static void main (String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        num = sc.nextInt();
        inchanle(num);
    }
    public static void inchanle(int x)
    {
        if(x%2==0)
        {
            System.out.println("Do la so chan");
        }
        else
        {
            System.out.println("Do la so le");
        }
    }
}
