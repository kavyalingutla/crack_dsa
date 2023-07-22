package warm_up;

public class palindromicstring {
    public static void main(String[] args) {
        String str = " ramar";
        String str1 = "";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            str1 = ch+str1;

        }

        System.out.println(str1);
        
      if(str.equals(str1)){
        System.out.println(" palindromic string ");

      } 
      else{
     System.out.println("  not palindromic string ");
    }
    }
}
