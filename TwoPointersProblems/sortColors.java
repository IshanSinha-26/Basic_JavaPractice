import java.util.*;
public class sortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {  // arr[mid] == 2
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
