import java.util.*;
public class commonElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("enter first array elements:");
        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("enter second array elements:");
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print("enter size of third array: ");
        int n3 = sc.nextInt();

        int[] arr3 = new int[n3];
        System.out.println("enter third array elements:");
        for (int i = 0; i < n3; i++){
            arr3[i] = sc.nextInt();
        }

        System.out.print("enter size of fourth array: ");
        int n4 = sc.nextInt();

        int[] arr4 = new int[n4];
        System.out.println("enter fourth array elements:");
        for (int i = 0; i < n4; i++){
            arr4[i] = sc.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> set4 = new HashSet<>();

        for (int i = 0; i < n1; i++){
            set1.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++){
            set2.add(arr2[i]);
        }
        for (int i = 0; i < n3; i++){
            set3.add(arr3[i]);
        }
        for (int i = 0; i < n4; i++){
            set4.add(arr4[i]);
        }

        System.out.print("common elements: ");
        for (int num : set1){
            if (set2.contains(num) && set3.contains(num) && set4.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}