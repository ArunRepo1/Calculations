package calculation;

public class Multiplication extends Add{
	
	int num1;
	int num2;
	
	Multiplication(int num1, int num2){
		super(num1,num2);
		this.num1=num1;
		this.num2=num2;
		
		
	}
	
	
	public int multiple()
	{
		int mul = num1*num2;
		return mul;
	}
	


}
