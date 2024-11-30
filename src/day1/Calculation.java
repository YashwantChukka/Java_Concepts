package day1;

public class Calculation {

	int a1;
	int a2;
	int a3;
	
	Calculation(int b1,int b2,int b3){
		a1 = b1;
		a2 = b2;
		a3 = b3;
	}
	
	void calculateSum() {
		System.out.println(a1+a2+a3);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation(20,30,40);
		
		cal.calculateSum();
	}
}
