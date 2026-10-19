import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 4 : User Input and Comparison（用户输入与比较）
 *
 * 目标：练习 Scanner 读取整数 + 基本 if / else 语句。
 */
public class Ex04AdultCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // 创建扫描器，用来读键盘输入

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();                // 读入一个整数

        if (age >= 18) {                            // 18 岁及以上
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are under 18.");
        }

        scanner.close();                            // 用完关掉，好习惯
    }
}
