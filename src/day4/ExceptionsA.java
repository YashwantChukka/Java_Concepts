package day4;

public class ExceptionsA {
	
	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		int a = 100;
		
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
	}

}
