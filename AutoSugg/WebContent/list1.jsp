<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>

 <% 
	try{      
		 String s[]=null;

		//Class.forName("com.mysql.jdbc.Driver"); 
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root", "password");
        String connectionUrl = "jdbc:sqlserver://192.168.93.242:1433;"+"instanceName=MSSQLSERVER2008;databaseName=TEST_HRMS;userName=sa;password=sa@123;";

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con = DriverManager.getConnection(connectionUrl);
        if (con != null) {
    		System.out.println("connected your database now!");
    	} else {
    		System.out.println("Failed to make connection!");
    	}
		Statement st=con.createStatement(); 
		//ResultSet rs = st.executeQuery("select * from employee");
		ResultSet rs = st.executeQuery("select * from IMAGE_CANDIDATE where ID=2");
		//rs.first();
		//System.out.println(rs.getString("empname"));
		//System.out.println(rs.getString("Name"));
	    byte[] fileBytes;
			while(rs.next()) 
 			{ 		
				//Blob bl = rs.getBlob("IMAGE");
		        //byte[] pict = bl.getBytes(1,(int)bl.length());
		        response.setContentType("image/jpeg");
		        //OutputStream o = response.getOutputStream();
				
				fileBytes = rs.getBytes("IMAGE");
                OutputStream targetFile = new FileOutputStream("d://desktop_bk//new.jpeg");

                targetFile.write(fileBytes);
                targetFile.close();
 			}  		
			
 		rs.close(); 
 		st.close(); 
		con.close();

		    } 
		catch(Exception e){ 
 			e.printStackTrace(); 
 		}

 %>