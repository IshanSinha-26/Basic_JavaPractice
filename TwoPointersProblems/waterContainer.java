import java.util.*;
public class waterContainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("Maximum water: " + maxArea);
        sc.close();
    }
}

