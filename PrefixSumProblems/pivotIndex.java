import java.util.*;

public class pivotIndex {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int totalSum = 0;

        System.out.println("Enter the array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for(int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {
                System.out.println("Pivot Index = " + i);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if(!found) {
            System.out.println("Pivot Index not found.");
        }

        sc.close();
    }
}