import java.util.*;
public class equilibriumIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;
        System.out.print("Enter the size of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        int leftSum = 0;
        int rightSum=0;
        for (int i = 0; i < n; i++) {
            rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.print("Eqilibrium index: " + i);
                break;
            }
            leftSum += arr[i];
        }
        if (leftSum > rightSum) {
            System.out.print("eqilibrium index not found");
        }
    }

}
