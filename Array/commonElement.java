import java.util.*;
public class commonElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();

        int[] arr1=new int[n];
        System.out.print("Enter the values of array: ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter the size of array: ");
        int m=sc.nextInt();

        int[] arr2=new int[m];
        System.out.print("Enter the values of array: ");
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        System.out.println("total no of duplicates value are "+count);
    }
}