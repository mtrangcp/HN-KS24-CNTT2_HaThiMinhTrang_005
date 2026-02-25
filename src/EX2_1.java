import java.util.Scanner;

public class EX2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for  (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập k: ");
        int k = sc.nextInt();
        if ( k > arr.length){
            k = k - arr.length;
        }

        for ( int i = 0 ; i < k; i++){
            int temp = arr[arr.length -1];
            for ( int m = arr.length -1; m > 0 ; m-- ){
                arr[m] = arr[m-1];
            }
            arr[0] = temp;
        }

        for ( int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
