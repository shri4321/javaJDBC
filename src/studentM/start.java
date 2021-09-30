package studentM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jdbc.student.student;
import com.jdbc.student.studentDau;

public class start {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to add student");
			System.out.println("PRESS 2 to delete student");
			System.out.println("PRESS 3 to display student");
			System.out.println("PRESS 4 to update student");
			System.out.println("PRESS 5 to exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("enter name");
				String name=br.readLine();
				
				System.out.println("enter phone");
				String phone=br.readLine();
				
				System.out.println("enter city");
				String city=br.readLine();
				
				student s=new student(name, phone, city);
				boolean ans = studentDau.insertStudentToDB(s);
				if(ans) {
					System.out.println("successfully added data");
				}else {
					System.out.println("something went wrong");
				}
				System.out.println(s);
				
				
				
			}else if(c==2) {
				
				System.out.println("enter ID to delete");
				int userID=Integer.parseInt(br.readLine());
				studentDau.deleteStudent(userID);
				boolean ans = studentDau.deleteStudent(userID);
				if(ans) {
					System.out.println("successfully deleted data");
				}else {
					System.out.println("something went wrong");
				}

				
			}else if(c==3) {
				System.out.println("ALL details");
				studentDau.showStudent();
				
			}else if(c==4){
				
				System.out.println("e");
				int id = Integer.parseInt(br.readLine());
				studentDau.updateStudent(id);
				boolean ans = studentDau.updateStudent(id);
				if(ans) {
					System.out.println("successful");
				}else {
					System.out.println("unsuccessful");
				}
				
			}else if(c==5) {
				
				break;
				
			}else {
				System.out.println("Thank you for using my Application");
				System.out.println("see you soon....bye bye");
			}
		}
		
	}

}
