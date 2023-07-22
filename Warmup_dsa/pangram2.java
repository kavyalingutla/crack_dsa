package warm_up;

// BRUTE FORCE APPROACH - start a loop from char a to z and xheck if each char is present in string if 
// yes return true else false . we need to traverse 26 times for 26 letters so we will lool into naive approach

public class pangram2 {
    public static void main(String[] args) {
      
      
        String str= "qazwsxcderfvbgtyhnmjuiklop";
        int len = str.length();
        if(alleters(str, len)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    static int size = 26;
        //naive approach
        static boolean isletter(char ch){
            if(Character.isLetter(ch)){
                return true;
            }
            return false;

        }

        static boolean alleters(String str, int len){
            str = str.toLowerCase();
            len = str.length();
            boolean [] present = new boolean[size];
            for(int i =0; i<len; i++){
                if(isletter(str.charAt(i))){
                    int letter = str.charAt(i) -'a';
                    present[letter] =true;

                }
            }
            for(int i =0; i<size; i++){
            if(!present[i])
              return false;
       
        }
        return true;

    
    }
        
    
    
}
