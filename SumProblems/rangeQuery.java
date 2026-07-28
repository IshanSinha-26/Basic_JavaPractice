/*import java.util.*;
public class rangeQuery{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the left index: ");
        int left=sc.nextInt();
        System.out.print("enter the right : ");
        int right=sc.nextInt();
        int sum=0;
        for(int i=left; i<=right; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the required range: "+ sum);
    }
}*/

import java.util.*;
public class rangeQuery{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] prefix=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.print("enter the left index: ");
        int left=sc.nextInt();
        System.out.print("enter the right : ");
        int right=sc.nextInt();
        int sum;
        if(left==0){
            sum=prefix[right];
        }else{
            sum=prefix[right]-prefix[left-1];
        }
        System.out.println("Sum of the required range: "+ sum);
    }
}