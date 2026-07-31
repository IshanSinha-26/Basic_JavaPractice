import java.util.*;
public class twoSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Indices: " + i + " " + j);
                    System.out.println("Values: " + arr[i] + " " + arr[j]);
                    found= true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.print("no pair found");
        }
        
    }
}