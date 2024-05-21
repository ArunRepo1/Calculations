package calculation;

public class Add {
	int num1;
	int num2;
	
	Add(int num1, int num2){
		this.num1=num1;
		this.num2=num2;	
		System.out.println("Parent class");
	}
	
	

	public int sum () {
		int sum=num1+num2;
		
	return sum;
	}

}
