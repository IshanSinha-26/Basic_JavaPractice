import java.util.*;
public class removeDuplicate {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("unique elements are: "+(i+1));
    }
}