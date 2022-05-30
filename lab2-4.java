import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = -6;
        float b = 3;
        float dx = 0.75f;

        System.out.println("x\t|\ty");
        System.out.println("————————————————————————————");

        for(float x = a; x <= b; x+=dx) {

            if (Double.isNaN((-Math.log(1-x))/x))
            {
                System.out.printf("Помилка (NaN)\n");
            }
            else {
                System.out.printf("%.2f\t|\t", x);
                System.out.printf("%.5f\n", (-Math.log(1 - x)) / x);
            }
        }
    }
}
