package warm_up;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
    String str ="listen";
    int len = str.length();
    String str1 = "silent";
    int len2 = str1.length();

    
  char [] ch1 = sortt(str, 0, len);
 char [] ch2 = sortt(str1, 0, len2);
 System.out.println(sortt(str1, 0, len2));

if(Arrays.equals(ch1, ch2)){
    System.out.println("yes anagram string");

}
else{
    System.out.print("no");
}

    }
    static char[] sortt(String str, int i, int j){
          i=0;
         
         char [] ch = str.toCharArray();
         while(i< str.length() ){
            j=i+1;
         while ( j < str.length()){
              if(ch[i] > ch[j]){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;


              }
              j++;
         }

         i++;
    }
    return ch;
}}
