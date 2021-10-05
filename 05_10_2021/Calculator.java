import java.util.*;

public class Calculator{
	static int add(int a, int b){
		return a + b;
	}
	
	static int subtract(int a, int b){
		return a - b;
	}
	
	static int multiply(int a, int b){
		return a * b;
	}
	
	static int divide(int a, int b){
		return a / b;
	}
	
	public static void main(String args[]){
		int num1, num2;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		while(choice < 5){
			System.out.print("\nChoose a number: ");
			System.out.print("\n 1 -> Add(+) ");
			System.out.print("\n 2 -> Subtract(-) ");
			System.out.print("\n 3 -> Multiply(*) ");
			System.out.print("\n 4 -> Divide(/) ");
			System.out.print("\n 5 -> Exit ");
			System.out.print("\nChoice: ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("Enter 2 numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					int ansAdd = add(num1, num2);
					System.out.print("\nANSWER -> " + num1 + " " + "+" + " " + num2 + " = " + ansAdd + "\n");
					break;
				case 2:
					System.out.print("Enter 2 numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					int ansSub = subtract(num1, num2);
					System.out.print("\nANSWER -> " + num1 + " " + "-" + " " + num2 + " = " + ansSub + "\n");
					break;
				case 3:
					System.out.print("Enter 2 numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					int ansMul = multiply(num1, num2);
					System.out.print("\nANSWER -> " + num1 + " " + "*" + " " + num2 + " = " + ansMul + "\n");
					break;
				case 4:
					System.out.print("Enter 2 numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					int ansDiv = 0;
					try{
						ansDiv = divide(num1, num2);
						System.out.print("\nANSWER -> " + num1 + " " + "/" + " " + num2 + " = " + ansDiv + "\n");
					}catch(ArithmeticException E){
						System.out.println("Zero cannot divide any number");
					}
					break;
				case 5:
					break;
				default:
					System.out.printf("Error! Enter correct operator");
				return;
			}
		}
		
		System.out.printf("\n");
	}
}