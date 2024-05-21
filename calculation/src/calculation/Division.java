package calculation;

public class Division extends Multiplication {
	
	Division(int num1,int num2){
		super(num1,num2);
		
	}
	public int div() {
		
		int div=num1/num2;
		
		return div;
	}

}
