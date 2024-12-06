package homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //HW3.unpairedNums();
        System.out.println(HW3.factorial(5));
        //HW3.unpairedNumsWhile();
        System.out.println(HW3.factorialWhile(5));
        //HW3.unpairedNumsDoWhile();
        System.out.println(HW3.factorialDoWhile(5));
        System.out.println(HW3.powerOfANumber(2, 3));
        //HW3.FirstTenNegatives();
        //HW3.multiplicationTable(2);
        HW3.firstTenUnpaired();
        int[] nums = {20, 3, 9, -1, 2};
        System.out.println(HW3.theSmallestOne(nums));
        System.out.println(HW3.theBiggestOne(nums));
        System.out.println(Arrays.toString(HW3.switchMinAndMax(nums)));
    }
}
