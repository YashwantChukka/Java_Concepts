package day1;

public class Cal_overload {

	//This keyword implementation
	
	int x,y,z;
	double c;
	double b;
	double a;
	
	int sum(int x,int y) {
		this.x = x;
		this.y=y;
		
		System.out.println(x+y);
		return x+y;
	}
	
	int sum(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println(x+y+z);
		
		return (x+y+z);
	}
	
	double sum(double x,double y) {
		a = x;
		b = y;
		
		System.out.println(x+y);
		
		return (x+y);
	}
	
	double sum(double x,double y,double z) {
		
		a = x;
		b = y;
		c = z;
		
		
		System.out.println(a+b+c);
		return (x+y+z);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Cal_overload co = new Cal_overload();
		co.sum(50,50);
		co.sum(10,20,30);
		co.sum(2.5, 2.5);
		co.sum(3.3, 5.4, 2.6);
	}

}
