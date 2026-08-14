import java.util.*;
public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        if (str2.contains(str1)) {
            System.out.println("string1 is the subset of string2");
        }
        else if (str1.contains(str2)) {
            System.out.println("string2 is the subset of string1");
        }
        else {
            System.out.println("no string is a subset of the other");
        }
        sc.close();
    }
}
