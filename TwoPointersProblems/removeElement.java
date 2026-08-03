import java.util.*;
public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to remove: ");
        int remove = sc.nextInt();

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != remove) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Array after removing element:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}