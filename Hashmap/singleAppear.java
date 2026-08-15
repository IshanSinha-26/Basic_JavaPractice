import java.util.*;
public class singleAppear{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n;i++){
            int stored=arr[i];
            if(map.containsKey(stored)){
                map.put(stored,map.get(stored)+1);
            }
            else{
                map.put(stored, 1);
            }
        }
        System.out.print("Value appear only once: ");
        for(int num:map.keySet())
            if(map.get(num)==1){
                System.out.print(num+" ");
            }
    }
}