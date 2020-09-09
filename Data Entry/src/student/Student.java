package student;

public class Student {
	
	public String name;
	public String rollno;
	public String course;
	public String dept;
	public static int c=1;
	
	
	
	
	public void readdata(String n,String r,String c,String d) {
		 this.name=n;
		 this.rollno=r;
		 this.course=c;
		 this.dept=d;
		
		
	};
	public void printdata() {
		
		System.out.println(" Name : "+this.name);
		System.out.println(" Rollno : "+this.rollno);
		System.out.println(" Course : "+this.course);
		System.out.println(" Departement : "+this.dept);
		
	};
	

}

 class UG extends Student{
	 
	 int result_UG;
	
}
 class PG extends Student{
	 
	 int result_PG;
	 String publication;
	 
 }
 