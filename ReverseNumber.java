import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=reverseNumber(num);
		isPallindrome(num,rev);
	

	}
	public static int reverseNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
		rev=rev*10+rem;
		num/=10;

		}
		return rev;	
	}

	public static void isPallindrome(int num ,int rev){
		if(num==rev)
		{
			System.out.println(num+ " is Pallindrome");
		}else{
			System.out.println(num+ " is not Pallindrome");
		}
	}
}