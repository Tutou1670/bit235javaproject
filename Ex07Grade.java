import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 7 : Simple Grading System（简易评分系统）
 *
 * 目标：实现有顺序的 if - else if 逻辑。
 * 关键点：判断必须从高到低，否则会被前面的条件提前拦下。
 *   HD 80-100 / D 70-79 / C 60-69 / P 50-59 / F below 50
 */
public class Ex07Grade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mark (0-100): ");
        int mark = scanner.nextInt();

        if (mark >= 80) {                 // 80 分及以上 -> HD
            System.out.println("HD");
        } else if (mark >= 70) {          // 到这里说明一定小于 80 -> 70-79
            System.out.println("D");
        } else if (mark >= 60) {          // 60-69
            System.out.println("C");
        } else if (mark >= 50) {          // 50-59
            System.out.println("P");
        } else {                          // 剩下就是 50 分以下
            System.out.println("F");
        }

        scanner.close();
    }
}
