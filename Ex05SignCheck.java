import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 5 : Positive, Negative, or Zero（正数、负数还是零）
 *
 * 目标：练习多分支 if / else if / else。
 */
public class Ex05SignCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();       // 用 double，小数也能判断

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
