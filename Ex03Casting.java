/*
 * BIT235 - Week 1 Exercises
 * Exercise 3 : Type Casting（类型转换）
 *
 * 目标：演示如何用显式强制转换（explicit casting）把结果变成 double，
 *       得到正确的平均值（小数），而不是被整数除法截断。
 */
public class Ex03Casting {

    public static void main(String[] args) {

        int total = 7;
        int count = 2;

        // 错误做法：两边都是 int，结果是整数除法，小数被丢掉
        int wrongAverage = total / count;              // 7 / 2 = 3

        // 正确做法：把其中一个操作数强转成 double，运算就会按小数进行
        double average = (double) total / count;       // 7.0 / 2 = 3.5

        System.out.println("total = " + total + ", count = " + count);
        System.out.println();
        System.out.println("Without casting (int)   : " + wrongAverage + "   <- decimals lost");
        System.out.println("With casting   (double) : " + average + "  <- correct");
    }
}
