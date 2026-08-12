import java.util.*;
public class commonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean[] found = new boolean[26];

        System.out.print("Common alphabets: ");
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z' &&
                str2.indexOf(ch) != -1 &&
                !found[ch - 'a']) {
                System.out.print(ch + " ");
                found[ch - 'a'] = true;
            }
        }
        sc.close();
    }
}