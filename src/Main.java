import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        System.out.println("Введите первое число: ");
        a = check_input();
        System.out.println("Введите второе число: ");
        b = check_input();

        System.out.println("Сумма двух числел = " + (a + b));
        System.out.println("Разница между этими числами = " + Math.abs(a-b));
        System.out.println("Ряд цифр от минимального из этих чисел до максимального: ");
        min_to_max(a, b);
    }

    public static int check_input()
    {
        int a;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt())
        {
            System.out.println("Только целые числа! Пожалуйста, повторите ввод");
            sc = new Scanner(System.in);
        }
        a = sc.nextInt();
        return a;
    }


    public static void min_to_max(int a, int b)
    {
        if (a < b)
        {
            for(int i = a; i <= b; i++)
            {
                System.out.printf("%d ",i);

            }
        }
        else
        {
            for(int i = b; i <= a; i++)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}
