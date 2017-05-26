import java.util.Scanner;


public class Identify_Triangle {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		// length of the sides of the Triangle: x, y, z
		System.out.println("Lengths of sides of Triangle:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		
		if (x == y && x== z){
			System.out.println("Bingo!! Equilateral Triangle");	
		  }
		
		else if (x > y && x > z){
		     int pyth = x*x -(y*y+z*z);
		     if (pyth == 0){
		    	System.out.println("Bingo!! Right-Angle Triangle.");
		    	
		     }else {
			      System.out.println("Neither Equilateral nor Right-Angle.");
		   }
		}	    
		
		else if (y > x && y > z){
		     int pyth = y*y -(x*x + z*z);
		     if (pyth == 0){
		    	System.out.println("Bingo!! Right-Angle Triangle.");
		     }else {
			      System.out.println("Neither Equilateral nor Right-Angle.");
		   }
		}
		
		else if(z > x && z > y){
		     int pyth = z*z -(x*x+y*y);
		     if (pyth == 0){
		    	System.out.println("Bingo!! Right-Angle Triangle.");	
		    		 
		     }else {
			      System.out.println("Neither Equilateral nor Right-Angle.");
		   }
		}
	}
}

			
			
	
	

