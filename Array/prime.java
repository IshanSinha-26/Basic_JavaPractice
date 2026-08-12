import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the no.: ");
        int n=sc.nextInt();
      
        boolean prime=true; 

        if(n<=1){
          prime=false;
        }
        for(int i=2; i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime==true){
            System.out.print("prime number");
        }
        else{
            System.out.print("not prime");
        }
        sc.close();
    }
    
}