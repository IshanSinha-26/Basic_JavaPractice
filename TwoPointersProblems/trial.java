import java.util.*;
public class trial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] result=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0; i<n; i++){
            boolean duplicate=false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                result[index]=arr[i];
                index++;
            }
        }
        System.out.print("required values: ");
        for(int k=0; k<index; k++){
            System.out.print(result[k] +" ");
        }
        sc.close();
    }
}
