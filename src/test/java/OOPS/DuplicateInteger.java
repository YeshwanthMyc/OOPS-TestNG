package OOPS;

public class DuplicateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5,2,3,3,3};
		
		boolean[] printed = new boolean[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println("Duplicte number:"+numbers[i]);
					printed[i] = true; // Mark as printed to avoid duplicate prints
                    break; 
				}
			}
			
		}
	}

}
