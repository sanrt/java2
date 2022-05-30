import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Обчислення значень функції:");

        do {
            try {
                System.out.print("Введіть a: ");
                int a = in.nextInt();
                System.out.print("Введіть b: ");
                int b = in.nextInt();
                System.out.print("Введіть y: ");
                int y = in.nextInt();

				int a1 = a-b*b;
				if(a1 < 0) throw new ArithmeticException("Число в корені меньше 0");

				int a2 = a*b;
				if(a2 < 0) throw new ArithmeticException("Число в корені меньше 0");

                double res = Math.sqrt(a1) + Math.sqrt(a2) + y/2;

                System.out.printf("Результат: %f\n", res);
                break;
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);
    }
}
