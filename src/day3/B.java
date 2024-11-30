package day3;

interface A {
	
	int a = 20;
	int b = 30;
	
	void sum(int a,int b);
}


public class B implements A {
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B in = new B();
		in.sum(a, b);
	}

}
