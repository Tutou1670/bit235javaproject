/*
 * BIT235 - Week 1 Exercises
 * Exercise 2 : Arithmetic Expressions（算术表达式）
 *
 * 目标：理解整数除法（integer division）和取余（modulus）。
 */
public class Ex02Arithmetic {

    public static void main(String[] args) {

        int a = 12;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        System.out.println("1. a + b = " + (a + b));   // 17  加法
        System.out.println("2. a - b = " + (a - b));   // 7   减法
        System.out.println("3. a * b = " + (a * b));   // 60  乘法
        System.out.println("4. a / b = " + (a / b));   // 2   整数除法（重点）
        System.out.println("5. a % b = " + (a % b));   // 2   取余（重点）

        System.out.println();
        System.out.println("--- Why does division behave this way? ---");
        System.out.println("Both a and b are 'int', so Java performs INTEGER division.");
        System.out.println("It divides normally and then THROWS AWAY the decimal part");
        System.out.println("(it does not round). 12 / 5 = 2.4 -> kept as 2.");
        System.out.println("The % operator gives the REMAINDER instead: 12 % 5 = 2,");
        System.out.println("because 5 goes into 12 twice (10) and leaves 2 behind.");
        System.out.println();
        System.out.println("To get the real decimal answer, cast one side to double:");
        System.out.println("(double) a / b = " + ((double) a / b));   // 2.4
    }
}
