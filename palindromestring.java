import java.util.*;
public class palindromestring {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String word = sc.next();
   palindrome(word);
   if(palindrome(word)){

   
        System.out.println("is palindrome");

   }
   else{
    System.out.println("no");
   }
    }

     static boolean palindrome(String word) {
 StringBuilder  sb = new StringBuilder(word);
     String result = sb.reverse().toString();

     if( result.equals(word)){
        return true;
     }
     else
     return false;

    }
}
