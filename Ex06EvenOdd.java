import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 6 : Even or Odd（奇偶判断）
 *
 * 目标：在条件里使用算术表达式。
 * 提示：用 % 取余。能被 2 整除（余数是 0）就是偶数。
 */
public class Ex06EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {                      // 余数为 0 -> 偶数
            System.out.println(number + " is Even.");
        } else {                                    // 否则 -> 奇数
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
