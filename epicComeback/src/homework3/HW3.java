package homework3;

public class HW3 {

    public static void unpairedNums() {
        for (int i = 1; i <= 99; i+=2) {
            System.out.println(i);
        }
    }

    public static int factorial (int num) {
        int res = 1;
        for (int i = 1; i<=num; i++) {
            res *= i;
        }
        return res;
    }

    public static void unpairedNumsWhile() {
        int i = 1;
        while (i<=99) {
            System.out.println(i);
            i+=2;
        }
    }
    public static int factorialWhile(int num) {
        int res = 1;
        int i = 1;
        while(i<=num) {
            res *= i;
            i++;
        }
        return res;
    }
    public static void unpairedNumsDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        }while (i<=99);
    }
    public static int factorialDoWhile(int num) {
        int res = 1;
        int i = 1;
         do {
            res *= i;
            i++;
        }while(i<=num);
        return res;
    }
    public static int powerOfANumber (int num, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
    public static void firstTenNegatives() {
        for (int i = 0; i >= -50; i-=5) {
            System.out.println(i);
        }
    }
    public static void multiplicationTable (int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(num+" * "+i+" = "+num * i);
        }
    }
    public static void firstTenUnpaired() {
        for (int i = 1; i < 20; i+=2) {
            if (i == 19) {
                System.out.println(i+".");
            }else {
                System.out.print(i+", ");
            }
        }
    }
    public static int theSmallestOne (int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    counter++;
                    if (counter == nums.length-1) {
                        min = nums[i];
                    }
                }
            }
        }
        return min;
    }
    public static int theBiggestOne (int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++;
                    if (counter == nums.length-1) {
                        max = nums[i];
                    }
                }
            }
        }
        return max;
    }
    public static int[] switchMinAndMax(int[] nums) {
        int min = theSmallestOne(nums);
        int max = theBiggestOne(nums);
        int[] clone = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            clone[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (clone[i] == min) {
                nums[i] = max;
            }
            if (clone[i] == max) {
                nums[i] = min;
            }
        }
        return nums;
    }
}
