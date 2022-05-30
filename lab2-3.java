import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		float sum = 0;
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i; j++) {
                sum += j/i;
            }
        }
		
        System.out.printf("Сума: %.2f\n", sum);
    }
}