/*
 * BIT235 - Week 1 Exercises
 * Exercise 8 : Boolean Expressions（布尔表达式）
 *
 * 目标：练习用 && （逻辑与）组合复合条件。
 *   > 30       -> It is hot.
 *   20 - 30    -> It is mild.
 *   < 20       -> It is cold.
 */
public class Ex08Temperature {

    public static void main(String[] args) {

        int temperature = 32;

        System.out.println("Temperature = " + temperature + " degrees");
        System.out.println();

        if (temperature > 30) {
            System.out.println("It is hot.");
        } else if (temperature >= 20 && temperature <= 30) {   // 两个条件同时满足才成立
            System.out.println("It is mild.");
        } else {
            System.out.println("It is cold.");
        }

        // 顺便演示一下 && 的短路特性：左边为 false 时右边根本不会算
        System.out.println();
        System.out.println("--- Extra demo: changing the value ---");
        temperature = 22;
        System.out.println("Temperature = " + temperature + " degrees");
        if (temperature > 30) {
            System.out.println("It is hot.");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It is mild.");
        } else {
            System.out.println("It is cold.");
        }
    }
}
