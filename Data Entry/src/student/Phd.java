package student;
import java.io.*;

public class Phd extends PG{
	 private String topic;
	 private String supervision;
	 public void readdata(String t,String s) {
		 
		 this.setTopic(t);
		 this.setSupervision(s);
	 };
    public void printdata() {
    	
     super.printdata();
   	 System.out.println(" Topic : "+this.getTopic());
		 System.out.println(" Supervision : "+this.getSupervision());
		 
    }
    public void Filewriter(String n,String r,String c,String d,String b,String clg)
	 {
		try {
			FileWriter fw= new FileWriter("C:\\Users\\User\\Desktop\\Studentdata\\PHD1.txt",true);
			String str[]= {n,r,c,d,b,clg};
			String s2[]= {"Name","Rollno","Course","Departement","Topic","Supervision"};
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
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSupervision() {
		return supervision;
	}
	public void setSupervision(String supervision) {
		this.supervision = supervision;
	};
	 
}

