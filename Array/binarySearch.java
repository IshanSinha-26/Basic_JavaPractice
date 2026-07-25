import java.util.*;
public class binarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the element to search: ");
        int key=sc.nextInt();

        int left=0, right=n-1,mid;
        while(left<=right){
            mid=(left+right)/2;

            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if(key<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(left>right){
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}