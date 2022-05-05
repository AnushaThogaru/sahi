package Com.practice;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221,rem,rev=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
	
	}
	if(temp==rev)
		System.out.println(temp + "Is palindrome");
	else
		System.out.println(temp + "Is not palindrome");
// TODO Auto-generated method stub

	}


	}

}
