import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Добуток непарних чисел менших за х у діапазоні [10 60]:");

		int x = in.nextInt();

        System.out.println("Цикл for: ");
		int dob = 1;
        for(int i = 10; i <= 60; i++)
        {
            if(i % 2 != 0 && i < x)
                dob*=i;
        }
        System.out.println(dob);

        System.out.println("Цикл while");
		dob = 1;
        int i = 10;
        while(i <= 60)
        {
            if(i % 2 != 0 && i < x)
                dob*=i;
            i++;
        }
        System.out.println(dob);
		System.out.println("Цикл do...while");
		dob = 1;
        i = 10;
        do
        {
            if(i % 2 != 0 && i < x)
                dob*=i;
            i++;
        } while(i <= 60);
        System.out.println(dob);
    }
}
