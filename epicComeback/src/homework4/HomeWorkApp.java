package homework4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("---------------");
        checkSumSign();
        System.out.println("---------------");
        printColor();
        System.out.println("---------------");
        compareNumbers();
        System.out.println("---------------");
        System.out.println(checkSumInRange());
        System.out.println("---------------");
        printPosOrNegNum(10);
        System.out.println("---------------");
        System.out.println(printPosOrNegNumBool(-10));
        System.out.println("---------------");
        repeatString("Hello world...", 3);
        System.out.println("---------------");
        System.out.println(checkIsYearLeap(2024));
    }
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        }else {
            System.out.println("Sum is negative");
        }
    }
    private static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Red");
        }else if (value <= 100) {
            System.out.println("Yellow");
        }else {
            System.out.println("Green");
        }
    }
    private static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
    private static boolean checkSumInRange() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
    private static void printPosOrNegNum(int num) {
        if(num >= 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
    private static boolean printPosOrNegNumBool(int num) {
        if(num >= 0) {
            return false;
        }
        return true;
    }
    private static void repeatString(String str, int rep) {
        for (int i = 0; i < rep; i++) {
            System.out.println(str);
        }
    }
    private static boolean checkIsYearLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }else if (year % 100 == 0) {
            return false;
        }else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
