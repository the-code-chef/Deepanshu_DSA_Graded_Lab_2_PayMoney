import java.util.Scanner;

public class Main {

    public static int calcTransaction(int[] arr, int target, int targetValue) {
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += arr[i];
            if (sum >= targetValue) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of transaction array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of array: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.print("Enter total no of targets that needs to be achieved: ");
        int target = sc.nextInt();
        System.out.print("Enter the values of target: ");
        int targetValue = sc.nextInt();
        sc.close();
        int finalTransactionNumber = calcTransaction(arr, target, targetValue);
        if (finalTransactionNumber > 0) {
            System.out.print("Target achieved after " + finalTransactionNumber + " transactions");
        } else {
            System.out.print("Given target is not achieved");
        }
    }

}