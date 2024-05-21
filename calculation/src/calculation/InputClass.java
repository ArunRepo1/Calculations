package calculation;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Arithmatic Calculation");
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		//Add add=new Add(num1,num2);
		Division div  =new Division (num1,num2);
		//System.out.println("Sum: "+add.sum());
		System.out.println("Multiple: "+div.multiple());
		System.out.println("Sum:"+ div.sum());
		System.out.println("Division: "+ div.div());
		

		
		

	}

}
