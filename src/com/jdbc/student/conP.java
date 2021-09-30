package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class conP {
	
	static Connection con;
	
	public static Connection createC() {
		//load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String pass="password";
			String url="jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true";
			
			con = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
