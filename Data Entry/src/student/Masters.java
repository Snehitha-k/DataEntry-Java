package student;
import java.io.*;
 public class Masters extends PG{
	 private String Specialization;
	 private String project;
	public  void readdata(String s,String p) {
		
		this.setSpecialization(s);
		this.setProject(p);
	}
	public void printdata() {
		
		super.printdata();
		
		 System.out.println(" Specialization : "+this.getSpecialization());
		 System.out.println(" Project : "+this.getProject());
		 
	}
	
	public void Filewriter(String n,String r,String c,String d,String b,String clg)
	 {
		try {
			FileWriter fw= new FileWriter("C:\\Users\\User\\Desktop\\Studentdata\\Masters1.txt",true);
			String str[]= {n,r,c,d,b,clg};
			String s2[]= {"Name","Rollno","Course","Departement","Specialization","Project"};
			fw.write(Student.c+ ")");
			for(int i=0;i<str.length;i++) {
				fw.write("\n"+s2[i]+":"+str[i]);
			}
			fw.write("\n");
			Student.c+=1;
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	 }
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	 
	 
}


