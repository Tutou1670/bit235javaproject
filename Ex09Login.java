import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 9 : Logical Operators（逻辑运算符）
 *
 * 目标：
 *   1. 用 .equals() 比较字符串，并用 && 组合两个条件。
 *   2. 理解为什么字符串比较要用 .equals() 而不是 == 。
 *
 * 为什么用 .equals() 而不是 == ？
 *   ==  比较的是"两个变量是否指向同一个对象"（内存地址），
 *       对于 String 这种对象，两个内容一样的字符串可能是不同的对象，用 == 会得到 false。
 *   .equals() 才是在比较"内容是否相同"，这才是我们真正想要的。
 *   （同理，比较 String 内容时永远别用 ==。）
 */
public class Ex09Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();   // 用 nextLine() 读一整行字符串

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // 正确写法：内容比较用 equals()，两个条件用 && 连起来
        if (username.equals("admin") && password.equals("java123")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Access denied.");
        }

        scanner.close();
    }
}
