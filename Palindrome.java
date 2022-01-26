package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String val="madam";
		String rev="";
		int len=val.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+val.charAt(i);
			
		}
		if(val.equals(rev)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
		

	}

	}


	