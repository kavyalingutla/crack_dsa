package warm_up.Two_pointerapproach;

import java.util.Arrays;

public class targetsum {

    public static void main(String[] args) {
        
        int arr[] = { 1, 2, 3, 4, 6 , 9 };
        int x = 7;
        int[] ans = twosum(arr, x);
        System.out.println(Arrays.toString(ans));

        // twopointrers
         int ans2[] = twosumpointers(arr, 0, arr.length-1, 7);
        System.out.println(Arrays.toString(ans2));
    }
 //bruteforce with big 0h n^2 

    static int[] twosum(int[] arr, int x){
       
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]+ arr[j] == x){
                      return new int[] {i,j};
                }
            }
        }
        return null;
    }


    // using two pointers bigoh N

    static int[] twosumpointers(int arr[] , int left, int right, int targetsum){
        while(left <right){
            int curentsum = arr[left] + arr[right];
            if(curentsum == targetsum){
                return new int[] {left, right};
            };
            if(curentsum < targetsum){
                left++;
            }
            else{
                right--;
            }

        }
        return new int[] {-1, -1};
    }


}
