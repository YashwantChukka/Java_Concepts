package day4;

public class Final_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Begins");
		
		int a = 100;
		
		try {
			System.out.println(a/0);
		}
		catch(Exception e) {
			
			System.out.println("catch block detected");
			
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Entered into finally block");
		}

	}

}
