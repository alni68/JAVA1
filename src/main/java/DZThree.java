import java.util.Random;
import java.util.Scanner;

public class DZThree {

    public static void main(String[] args) {
        accident();
        checkingTheNumber();
    }

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void accident() {
        System.out.println("Угадайте число от 0 до 9 с трех попыток");
        System.out.println();
    }

    public static Scanner sc = new Scanner(System.in);

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    static void checkingTheNumber() {
        Random rand = new Random();
        int x = rand.nextInt(10);
//        System.out.println(x);
        int i;
        for (i = 0; i < 3; i++) {
            int d = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);
            if (d < x) {
                System.out.println("Число больше");
            }
            else if (d == x) {
                System.out.println("Вы угадали");
                break;
            } else System.out.println("Число меньше");
        }
    }
}