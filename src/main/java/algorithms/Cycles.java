package algorithms;

import java.util.regex.Pattern;

public class Cycles {
    public static void main(String[] args) {
        example1(119);
        int[] num = {43, 34, 52, 87, 98, 10};
        example2();
        task1(-1.5, 1.5, 0.2);
        task2(0.7, 1.8, 0.1);
        task11(1.9);

    }

    public static void example1(int num) {
        int index = 0;
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        int min = Character.getNumericValue(ch[0]);
        int max = Character.getNumericValue(ch[0]);
        while (index < ch.length) {
            if (Integer.parseInt(String.valueOf(ch[index])) > max) {
                max = Character.getNumericValue(ch[index]);
            }
            if (Integer.parseInt(String.valueOf(ch[index])) < min) {
                min = Character.getNumericValue(ch[index]);

            }
            index++;

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static void example2() {
        int firstDigit;
        int lastDigit;
        for (int i = 10; i < 99; i++) {
            firstDigit = i / 10;
            lastDigit = i % 10;
            if (firstDigit + lastDigit == 7) {
                System.out.print(firstDigit);
                System.out.print(lastDigit);
            }

        }


    }

    public static void task1(double a, double b, double h) {
        double y;
        double max = 0;
        double num = 0;
        double min = 10;
        for (double x = a; x <= b; x = x + h) {
            y = Math.exp(x + 1) * Math.cos(x);
            System.out.println("num = " + num++);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            if (y > 0) {
                System.out.println("Function increases");
            }
            if (y < 0) {
                System.out.println("Function decreases");
            }
            double diff = Math.exp(x + h + 1) * Math.cos(x + h) - y;
            System.out.println("diff = " + diff);
            if (y > max) {
                max = y;
            } else if (y < min) {
                min = y;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static void task2(double a, double b, double h) {
        double y = 0;
        double min = 0;
        double max = 0;
        double num = 1;
        for (double x = a; x <= b; x = x + h) {
            y = -Math.log10(Math.abs(2 * Math.sin(x / 2)));
            System.out.println("num = " + num++);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            double diff = Math.log10(Math.abs(2 * Math.sin((x + h) / 2))) - y;
            System.out.println("diff = " + diff);
            if (y > 0) {
                System.out.println("Function increases");
            } else if (y < 0) {
                System.out.println("Function decreases");
            }
            if (y > max) {
                max = y;
            } else min = y;

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static void task11(double a) {
        double zmanematel = 2;
        double num = 1;
        while (num <= a) {
            num = num + (1 / zmanematel++);
        }
        if (num > a) {
            System.out.println("num = " + num);
        }

    }
}
