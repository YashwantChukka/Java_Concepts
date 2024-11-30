package day3;


//If we are using same interface name for different classes under same package then it
//will throw an error which says A has been already defined
interface C{
	int a = 50;
	int b = 35;
	
	void add(int s,int p);
}

interface D{
	
	int x = 20;
	int y = 10;
	
	void mul(int x,int y);
	
}

public class Calculation implements C,D {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public void mul(int x,int y) {
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calculation ca = new Calculation();
		 ca.add(a, b);
		 ca.mul(x, y);
	}

}
