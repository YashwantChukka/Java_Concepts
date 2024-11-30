package day1;

public class Student {
	String SID;
	String Sname;
	int sub1;
	int sub2;
	int sub3;
	
	
	void getStuData(String S1,String S2) {
		
		SID = S1;
		Sname = S2;
		
	}
	
	void getStuMarks(int m1,int m2,int m3) {
		sub1 = m1;
		sub2 = m2;
		sub3 = m3;
	}
	
	void totalMarks() {
		System.out.println(sub1+sub2+sub3);
	}
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.getStuData("007", "James Bond");
		stu1.getStuMarks(25, 25, 25);
		stu1.totalMarks();
		
		
	}

}
