package warm_up;

public class sqrt3 {
   public static void main(String[] args) {
		
		
		
	
		double num = 16;
		
		double temp, squareroot;
		
		squareroot = num / 2;
		
		do {
			temp = squareroot;
			squareroot = (temp + (num / temp))/2;
		}
         while((temp - squareroot) != 0);
		
		System.out.println("\nThe Square Root of a Number without sqrt = " + squareroot);
	}
}