
public class Calculator {
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b; 
	}

	@Override
	public double divide(double a, double b) {
		if(b==0.0){
			throw new IllegalArgumentException("nie wolno dzielic przez 0");
		}
		return a/b;
}
	}
