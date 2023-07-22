package warm_up;
import java.util.*;

public class duplicates {

   // Given an integer array nums, return true if any value appears at least twice in the array, 
     //  and return false if every element is distinct.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index < arr.length; index++) {

            arr[index] = sc.nextInt();
        }
            
            System.out.print(dupli(arr));
        
    }

    // brute force APPROACh with time complexity  big oh (N ^2) 
        static boolean  dupli(int arr[]){
            // outer loop starts from 0 to n
         for (int i= 0; i < arr.length; i++) {
// inner loop starts from i to n 
        for(int j = i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                 
                return true;
               

            }
        }
          
        
        }
        return false;

    }


    }
    
