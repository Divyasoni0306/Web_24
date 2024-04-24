package wed_24;

import java.util.Scanner;

public class Student {

	int stdid;
	String stdName;
	float stdMarks;
	
	
//Setter getter method
	public int getStdid() {
		return stdid;
	}


	public void setStdid(int stdid) {
		this.stdid = stdid;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public float getStdMarks() {
		return stdMarks;
	}


	public void setStdMarks(float stdMarks) {
		this.stdMarks = stdMarks;
	}


	
//tostring method
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}
	

	public static void main(String[] args) {
		Student std[] = new Student[2];
		Scanner sc = new Scanner(System.in);
//		Taking inputs from user
		System.out.println("Enter Student Details-");
		for(int i=0; i<2; i++) {
			Student b = new Student();
			System.out.print("Enter Student Id: ");
			int stdid = sc.nextInt();
			sc.nextLine();
			b.setStdid(stdid);
			System.out.print("Enter Student Name: ");
			String stdName = sc.nextLine();
			b.setStdName(stdName);
			System.out.print("Enter Student Marks: ");
			float stdMarks = sc.nextFloat();
			b.setStdMarks(stdMarks);
			std[i] = b;
			

			
			
		}
//		printing the output
			for(int i1=0; i1<2; i1++) {
				System.out.println(std[i1]);
		
	}

}


	


}
