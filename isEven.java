import java.util.Scanner;
class isEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		evenOdd(num);

	}
	public static void evenOdd(int num){
		if(num%2==0){
			System.out.println(num+ "- is even ");
		}else{
			System.out.println(num+"- is odd");
		}
	}
}