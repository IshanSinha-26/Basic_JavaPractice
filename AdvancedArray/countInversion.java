import java.util.*;
public class countInversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the value of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int inversion=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    inversion++;
                }
            }
        }
        System.out.print("total no. of inversion: "+inversion);
    }
    
}
