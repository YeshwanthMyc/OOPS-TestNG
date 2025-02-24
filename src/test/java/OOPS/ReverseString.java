package OOPS;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Yeshwanth";
		String reveresed ="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reveresed=reveresed+name.charAt(i);
		}
		System.out.println(reveresed);

	}

}
