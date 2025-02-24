package OOPS;

public class StringBuilder {
	public static void main(String[] args) {
        String input = "hheellloooo";
        String output = "";
        int count = 1; 
       for(int i=0;i<input.length();i++) {
    	   if(i<input.length()-1&&input.charAt(i)==input.charAt(i+1))
    	   {
    		   count++;
    	   }
    	   else {
    		   output=output+input.charAt(i);
    		   if(count>1) {
    			   output=output+count;
    		   }
    		   count=1;
    	   }
       }
       
        System.out.println(output);
	}

}
