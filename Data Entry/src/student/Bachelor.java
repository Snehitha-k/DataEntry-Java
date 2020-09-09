package student;
import java.io.*;

	
	public class Bachelor extends UG{
		 private String branch;
		 private String college;
		 public void readdata(String b,String c) {
			 
	
			 
			 this.setBranch(b);
			 this.setCollege(c);
			 
		 };
		 public void printdata() {
			 
			 super.printdata();
			 
			 System.out.println(" Branch : "+this.getBranch());
			 System.out.println(" College : "+this.getCollege());
			 
			 
			 
		 }
		 public void Filewriter(String n,String r,String c,String d,String b,String clg)
		 
		 
		 {
			 
			
			try {
				FileWriter fw= new FileWriter("C:\\Users\\User\\Desktop\\Studentdata\\UG1.txt",true);
				String str[]= {n,r,c,d,b,clg};
				String s2[]= {"Name","Rollno","Course","Departement","Branch_ID","College"};
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
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		};
		 
		 
	 }


