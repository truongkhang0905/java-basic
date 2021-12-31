package Day1;

import java.util.Scanner;

public class Test04_Max {
    public static void main (String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N0.1: ");
        num1 = sc.nextInt();

        System.out.println("Input N0.2: ");
        num2 = sc.nextInt();

        System.out.println("Input N0.3: ");
        num3 = sc.nextInt();
        Max_number(num1, num2, num3);
    }
    public static void Max_number(int num1, int num2, int num3)
    {
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" -> This is max_number!!");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" -> This is max_number!!");
        else
            System.out.println(num3+" -> This is max_number!!");
    }

}
