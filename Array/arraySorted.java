import java.util.*;
public class arraySorted{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted==true){
            System.out.println("Array is sorted in ascending order.");
        }
        else{
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}