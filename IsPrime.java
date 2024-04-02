import java.util.Scanner;
class IsPrime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=2;i<=50;i++)
		{
		    isPrime(i);	
		}
		
		

	}
	public static void isPrime(int num)
	{
		boolean flag =true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag =false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"-is prime");

		}
		}
	}
