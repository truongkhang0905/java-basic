package Day1;

import java.util.Scanner;

public class Test02 {
    public static void main (String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        num = sc.nextInt();
        DayofWeek(num);
    }
    public static void DayofWeek(int day)
    {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
