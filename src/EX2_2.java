import java.util.Scanner;

public class EX2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for  (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.print("Max là: " + maxSum);
    }
}
