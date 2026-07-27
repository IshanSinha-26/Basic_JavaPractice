import java.util.*;
public class rotateLeft{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number of rotations: ");
        int m=sc.nextInt();
        m=m%n;
        for(int r=1;r<=m;r++){
            int temp=arr[0];
            int j=n-1;
            for(int i=0; i<j;i++){
                arr[i]=arr[i+1];
            }
            arr[j]=temp;
        }
        System.out.println("Array after left rotation: ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}