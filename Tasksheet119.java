import java.util.Scanner;
public class Tasksheet119
{
    public static void main(String args[])
    {
        System.out.print("\t Addition \n");
        int x, y, sum;
        Scanner fc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = fc.nextInt();
        System.out.print("Enter the second number: ");
        y = fc.nextInt();
        sum = sum(x, y);
        System.out.println("Answer: " + sum);

        System.out.print("\t Subtraction \n");
        int o, p, sub;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        o = sc.nextInt();
        System.out.print("Enter the second number: ");
        p = sc.nextInt();
        sub = sub(o, p);
        System.out.println("Answer: " + sub);

        System.out.print("\t Multiplication \n");
        int q, w, multi;
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        q = rd.nextInt();
        System.out.print("Enter the second number: ");
        w = rd.nextInt();
        multi = multi(q, w);
        System.out.println("Answer: " + multi);

        System.out.print("\t Division \n");
        double e, r, div;
        Scanner th = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        e = th.nextInt();
        System.out.print("Enter the second number: ");
        r = th.nextInt();
        div = div(e, r);
        System.out.println("Answer: " + div);

    }

    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b)
    {
        int sub = a - b;
        return sub;
    }

    public static int multi(int a, int b)
    {
        int multi = a * b;
        return multi;
    }

    public static double div(double a, double b)
    {
        double multi = a / b;
        return multi;
    }
}
