import java.util.*;
public class mergeSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length of 1st array: ");
        int n= sc.nextInt();
        int[] arr1=new int[n];
        System.out.print("enter the values of 1st array: ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter the length of 2nd array: ");
        int m= sc.nextInt();
        int[] arr2=new int[m];
        System.out.print("enter the values of 2nd array: ");
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        int[] result=new int[m+n];

        int i=0, j=0, k=0;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=arr2[j];
            j++;
            k++;
        }
        System.out.print("sortedArray: ");
        for(int l=0; l<result.length; l++){
            System.out.print(result[l] + " ");
        }
        sc.close();
    }
    
}
