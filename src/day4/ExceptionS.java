package day4;

public class ExceptionS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program begins");
		
	   try {
		   String s = "abc";
		   int i = Integer.parseInt(s);
	   }
	   catch(Exception e) {
		   
		   System.out.println(e);
		   e.printStackTrace();
	   }

	}

}
