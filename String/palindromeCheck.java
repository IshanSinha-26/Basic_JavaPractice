import java.util.*;
public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 

        System.out.print("enter the string: ");
        String str=sc.nextLine();

        int left=0;
        int right=str.length()-1;
        boolean palindrome=true;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome==true){
            System.out.print("this is palindrome");
        }else{
            System.out.print("this is not palindrome");
        }
        sc.close();
    }
}

// import java.util.*;
// public class palindromeCheck {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in); 

//         System.out.print("enter the string: ");
//         String str=sc.nextLine();

//         String reverse="";
//         for(int i=str.length()-1; i>=0; i--){
//             reverse=reverse + str.charAt(i);
//         }
//         if(str.equals(reverse)){
//             System.out.print("it is palindrome");
//         }else{
//             System.out.print("it is not");
//         }
//         sc.close();
//     }
// }