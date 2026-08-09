import java.util.*;
public class productexceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of array: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] result=new int[n];

        for(int i=0; i<n; i++){
            int product=1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    product= product*arr[j];
                }
            }
            result[i]=product;
        }
        System.out.print("required array: ");
        for(int k=0; k<n; k++){
            System.out.print(result[k]+" ");
        }
    }
}


/* ***************************************************************
 import java.util.*;
public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        // Prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * arr[i];
        }

        // Suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }

        System.out.print("Product array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}*/
