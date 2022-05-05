package Com.practice;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);// TODO Auto-generated method stub
		}
		System.out.println("reverse of string is: "+rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("Non palindrome string");	
		}

	}



	}

}
