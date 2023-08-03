package algorithms;

import java.util.Scanner;

public class Syntaxis {
    public static void main(String[] args) {
        double function = calcFunction(9);
        System.out.println("function = " + function);
        double result1 = task1(0, 2, 3);
        System.out.println("result1 = " + result1);
        double result2 = task2(0, 1);
        System.out.println("result2 = " + result2);
        double result4 = task4(1, -1);
        System.out.println("result4 = " + result4);
        double result15c = task15c(4, 8, 3);
        System.out.println("result15c = " + result15c);
        String result16 = task16(5, 4, 5, 10);
        System.out.println("result16 = " + result16);
        identifyTheTriangle(3, 4, 5);
        checkTheAnswer(5, 3);
        determineTheGrades(2);
    }

    public static double calcFunction(double x) {
        double y = 0;
        if (x < 0) {
            y = Math.pow(x, 2);
        } else if (x <= 4 && x >= 0) {
            y = Math.sin(x);

        } else if (x > 4) {
            y = Math.sqrt(x);
        }
        return y;
    }

    public static double task1(double a, double x, double y) {
        double f = 0;
        if (a < 0) {
            f = Math.min(Math.pow(x, 2), Math.pow(y, 2)) + a;
        } else if (a == 0) {
            f = Math.max(Math.max(a, x), y);
        } else if (a > 0) {
            f = Math.abs(x - y) + y * (x + Math.sqrt(Math.pow(x, 3)));
        }
        return f;
    }

    public static double task2(double x, double y) {
        double f = 0;
        double v = Math.abs(x) + Math.abs(y);
        if (v < 1 || x >= 0) {
            f = Math.max(x, y) + Math.sqrt(x);
        } else if (v > 10 || (x < 0 && y < 0)) {
            f = Math.min(x, y) + Math.pow(Math.sin(x), 2) - Math.pow(Math.cos(y), 2);

        } else {
            f = Math.exp(Math.pow(x, 2) + y);
        }
        return f;
    }

    public static double task4(double z, double k) {
        double x = 0;
        double y = 0;
        if (k < 1) {
            x = k * Math.pow(z, 3);
            y = Math.pow(Math.log10(1 + Math.pow(x, 2)) + Math.cos(x + 1), Math.exp(k * x));
        } else if (k > 1) {
            x = z * (z + 1);
            y = Math.pow(Math.log10(1 + Math.pow(x, 2)) + Math.cos(x + 1), Math.exp(k * x));
        }
        return y;
    }

    public static double task14a(double y, double x, double z) {
        return Math.max(Math.min(x, y), z);
    }

    public static double task14b(double y, double x, double z) {
        return Math.max(x, 0) + Math.min(y, z);
    }

    public static double task14c(double x, double y, double z) {
        return Math.min(Math.min(x, y), 0) + Math.max(y, z);
    }

    public static double task15a(double x, double y, double z) {
        return Math.max(x + y + z, x * y * z) + 3;
    }

    public static double task15b(double x, double y, double z) {
        return Math.min((Math.pow(x, 2) + Math.pow(y, 2)), Math.pow(y, 2) + Math.pow(z, 2)) - 4;

    }

    public static double task15c(double x, double y, double z) {
        double f = 0;
        if (x > y && x > z) {
            f = y * z;
        } else if (z > x && z > y) {
            f = x * y;
        } else if (y > x && y > z) {
            f = x * z;
        }
        return f;
    }

    public static String task16(double x, double y, double r, double R) {
        double hypotheniuse = Math.pow(x, 2) + Math.pow(y, 2);
        if (hypotheniuse <= Math.pow(R, 2) && hypotheniuse >= Math.pow(r, 2)) {
            return "Y";
        }
        return "N";
    }

    public static void task17(double x, double y) {
        double x1 = -2;
        double y1 = 0;
        double x2 = 0;
        double y2 = 2;
        double x3 = 2;
        double y3 = 0;
        double a = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y);
        double b = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);
        double c = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);
        if (a >= 0 && b >= 0 && c >= 0 || a <= 0 && b <= 0 && c <= 0) {
            System.out.println("Multiply x" + x * 10 + " and  multiply y" + y * 10);
        }
        x = x - 0.5;
        y = y - 0.5;
        System.out.println("x =" + x + "and y = " + y);
    }

    public static void identifyTheTriangle(double a, double b, double c) {
        if (a == b && a == c && b == c) {
            System.out.println("The triangle is equilateral");
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)
                || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            System.out.println("The triangle is rectangular");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles");
        }
    }

    public static void checkTheAnswer(double a, double b) {
        Scanner scanner = new Scanner(System.in);
        double answer = scanner.nextDouble();
        if (a * b == answer) {
            System.out.println("The answer is correct");
        } else {
            System.out.println("Try again");
            double newAttempt = scanner.nextDouble();
            if(a * b == newAttempt){
                System.out.println("The answer is correct, great!");
            }
        }
    }
    public static void determineTheGrades(int mark){
        if(mark >= 1 && mark <= 3){
            System.out.println("Inadequate");
            System.out.println(2);
        }else if( mark >= 4 && mark < 6){
            System.out.println("Adequate");
            System.out.println(3);
        }else if (mark >= 6 && mark <= 8){
            System.out.println("Good");
            System.out.println(4);
        }else if(mark >= 9 && mark <= 10){
            System.out.println("Great");
            System.out.println(5);
        }
    }
}




