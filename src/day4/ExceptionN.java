package day4;

public class ExceptionN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Started");
		
		try {
			int a[] = null;
			System.out.println(a.length);
		}
		catch(Exception e) {
			System.out.println("exception pakda gaya hehehe");
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
