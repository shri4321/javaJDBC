package com.jdbc.student;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class studentDau {
	
	
	public static boolean insertStudentToDB(student st) {
		boolean f=false;
		
		try {
			Connection con = conP.createC();
			String q = "insert into students(sname,sphone,scity)values(?,?,?)";
			//preparedStatment
			PreparedStatement p=con.prepareStatement(q);
			//set values
			p.setString(1, st.getStudentName());
			p.setString(2, st.getStudentPhone());
			p.setString(3, st.getStudentCity());
			
			//execute
			p.executeUpdate();
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int userID) {
		// TODO Auto-generated method stub
		boolean f=false;
		
		try {
			Connection con = conP.createC();
			String q = "delete from students where sid=?";
			//preparedStatment
			PreparedStatement p=con.prepareStatement(q);
			//set values
			p.setInt(1, userID);
			
			
			//execute
			p.executeUpdate();
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showStudent() {
		// TODO Auto-generated method stub
		boolean f=false;
		
		try {
			Connection con = conP.createC();
			String q = "select * from students;";
			//preparedStatment
			 Statement s= con.createStatement();
			ResultSet set= s.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("ID:"+id);
				System.out.println("name"+name);
				System.out.println("phone"+phone);
				System.out.println("city"+city);
				
				System.out.println("---------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	
	public static boolean updateStudent(int id) {
		// TODO Auto-generated method stub
		boolean f=false;
		
		try {
			Connection con = conP.createC();
			String q = "update students set sname= 'shrikant singh',scity='noida' where sid=?";
			//preparedStatment
			PreparedStatement p=con.prepareStatement(q);
			//set values
			p.setInt(1, id);
			
			
			//execute
			p.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
		
	}

}
