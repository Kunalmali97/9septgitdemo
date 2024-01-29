package rivision;

public class Throws {
	
	public static void main(String[] args)   {
		
		int b=10;
		int c=20;
		try {
			int a =10/0;
			
			System.out.println(a);
		}catch (ArithmeticException e) {
			
			System.out.println("exception arrived");
		}
		
		if(b<c) {
			throw new NullPointerException("software is under construction");
		}
		
	}

}
