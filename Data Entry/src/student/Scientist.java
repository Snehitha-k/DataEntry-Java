package student;
import java.io.*;
 public class Scientist extends PG
{
	 private String area;
	private String id;
	 public void readdata(String a,String i) {
		 
		 this.setArea(a);
		 this.setId(i);
	 };
    public void printdata() {
    	super.printdata();
   	 
   	 System.out.println(" Area : "+this.getArea());
		 System.out.println(" ID : "+this.getId());
		 
    }
    public void Filewriter(String n,String r,String c)
	 {
		try {
			FileWriter fw= new FileWriter("C:\\Users\\User\\Desktop\\Studentdata\\Scientist1.txt",true);
			String str[]= {n,r,c};
			String s2[]= {"Name","ID","Area"};
			fw.write(Student.c+ ")");
			for(int i=0;i<str.length;i++) {
				fw.write("\n"+s2[i]+":"+str[i]+"\n");
			}
			fw.write("\n");
			Student.c+=1;
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	 }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	};
	 

}
