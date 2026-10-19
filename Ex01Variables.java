/*
 * BIT235 - Week 1 Exercises
 * Exercise 1 : Declaring Variables（声明变量）
 *
 * 目标：正确使用 int / double / char / boolean 四种基本数据类型。
 * 说明：本题不需要用户输入，直接把值写死（hard code）在变量里。
 */
public class Ex01Variables {

    public static void main(String[] args) {

        int     age            = 21;      // int     -> 整数，用来存年龄
        double  heightMetres   = 1.68;    // double  -> 小数，身高（单位：米）
        char    firstInitial   = 'Z';     // char    -> 单个字符，名字首字母（注意用单引号）
        boolean enrolledBIT235 = true;    // boolean -> 真假值，是否在修 BIT235

        // 把所有变量的值打印出来
        System.out.println("Age                : " + age);
        System.out.println("Height (metres)    : " + heightMetres);
        System.out.println("First initial      : " + firstInitial);
        System.out.println("Enrolled in BIT235 : " + enrolledBIT235);
    }
}
