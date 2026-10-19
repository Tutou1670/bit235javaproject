import java.util.Scanner;

/*
 * BIT235 - Week 1 Exercises
 * Exercise 10 : Mini Decision Program（综合决策小程序）
 *
 * 目标：把多个条件组合起来，练习嵌套/多分支逻辑。
 *   age >= 18 且有驾照                  -> You can drive independently.
 *   16 <= age < 18 且有驾照             -> You can drive with restrictions.
 *   其它情况                            -> You cannot drive.
 */
public class Ex10DriveDecision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a driver licence? (true/false): ");
        boolean hasLicence = scanner.nextBoolean();   // 读入 true / false

        if (age >= 18 && hasLicence) {
            System.out.println("You can drive independently.");
        } else if (age >= 16 && age < 18 && hasLicence) {
            System.out.println("You can drive with restrictions.");
        } else {
            System.out.println("You cannot drive.");
        }

        scanner.close();
    }
}
