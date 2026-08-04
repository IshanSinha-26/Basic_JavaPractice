import java.util.*;
public class squareSorted2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[i] = arr[left] * arr[left];
                left++;
            }
            else {
                result[i] = arr[right] * arr[right];
                right--;
            }
        }
        System.out.print("Squares of sorted array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(result[k] + " ");
        }
        sc.close();
    }
}
