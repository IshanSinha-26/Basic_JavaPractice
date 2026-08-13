// import java.util.*;
// public class countWords {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the sentence: ");
//         String str=sc.nextLine();

//         int count=1;
//         str=str.trim(); 
        
//         if(str.isEmpty()){
//             count=0;
//         }
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==' '){
//                 count++;
//             }
//         }
//         System.out.print("word count: "+count);
//         sc.close();
//     }
    
// }

import java.util.*;

public class countWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.isEmpty()) {
            System.out.println("Word count: 0");
        }
        else {

            String[] words = str.split("\\s+");

            System.out.println("Word count: " + words.length);
        }

        sc.close();
    }
}