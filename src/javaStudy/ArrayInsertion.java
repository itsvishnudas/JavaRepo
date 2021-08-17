package javaStudy;

public class ArrayInsertion {
	
	

	public static void main(String[] args) {

		int array[] = new int[6];
		int arrlength = 0;

		for (int i = 0; i < 3; i++) {
		    array[arrlength] = i;
		    arrlength++;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Old Index " + i + " contains " + array[i]);
		}
		
		System.out.println("\n");
		array[arrlength] = 10;
		arrlength++;
		
		for (int i = 0; i < array.length; i++) {
		    System.out.println(" New Index " + i + " contains " + array[i]);
		}
		
		System.out.println("\n");
		
		for(int i=3; i>=0; i--) {
			
			array[i+1] = array[i];
			
		}
		for (int i = 0; i < array.length; i++) {
		    System.out.println(" New spaced Index " + i + " contains " + array[i]);
		    
		}
		array[0] = 23;
		arrlength++;
		
		for (int i = 0; i < array.length; i++) {
		    System.out.println(" New inserted Index " + i + " contains " + array[i]);
		    
		}
		
		for(int i=4; i>=2; i--) {
			
			array[i+1] = array[i];
		}
		 array[2] = 24; 
		 
		 for (int i = 0; i < array.length; i++) {
			    System.out.println(" New 2nd element Index " + i + " contains " + array[i]);
			    
		 }
			    

			    array[1] = 44;
			    
			    for (int i = 0; i < array.length; i++) {
				    System.out.println(" New 3rd element Index " + i + " contains " + array[i]);
			    }
			    

	}

}
