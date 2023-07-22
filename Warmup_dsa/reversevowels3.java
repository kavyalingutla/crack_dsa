package warm_up;

public class reversevowels3 {
      public static void main(String[] args) {
        String str ="aeiou aeiou";
        int len = str.length();
        System.out.println(reverse(str));

      }
      static boolean isvowel(char c){
        return( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
      }

     static  String reverse(String str){
        
        int i=0; 
        int j = str.length()-1;
       char[] str1 = str.toCharArray();
        while(i<j){
            if(!isvowel(str1[i])){
                i++;
                continue;
            }
            if(!isvowel(str1[j])){
                j--;
                continue;
            }
            char t = str1[i];
            str1[i] = str1[j];
            str1[j] = t;

        
        i++;
        j--;

        }
        String str2 = String.copyValueOf(str1);

        return str2;



     }
}
