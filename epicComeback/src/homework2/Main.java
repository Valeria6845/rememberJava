package homework2;

public class Main {
    public static void main(String[] args) {
        double firstSum = Integer.parseInt(args[0]);
        double sum = Integer.parseInt(args[0]);
        double percent = Integer.parseInt(args[1]);
        int termInMonths = Integer.parseInt(args[2]) * 12;
        double profit = 0;
        for (int i = 1; i<=termInMonths; i++) {
            sum += sum * (percent/100);
            if (i % 12 == 0) {
                System.out.println("Result of the "+i/12+" year(s): "+sum);
                profit = sum-firstSum;
                System.out.println("Profit: "+profit);
                System.out.println("...");
            }
        }
        System.out.println("-----------------");
        System.out.println("Final sum is: "+sum+" with profit: "+profit);
    }
}