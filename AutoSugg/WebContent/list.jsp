<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

 <% 
	try{      
		 String s[]=null;

		//Class.forName("com.mysql.jdbc.Driver"); 
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root", "password");
        String connectionUrl = "jdbc:sqlserver://192.168.93.242:1433;"+"instanceName=MSSQLSERVER2008;databaseName=TESTING_DB;userName=sa;password=sa@123;";

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con = DriverManager.getConnection(connectionUrl);
        if (con != null) {
    		System.out.println("connected your database now!");
    	} else {
    		System.out.println("Failed to make connection!");
    	}
		Statement st=con.createStatement(); 
		//ResultSet rs = st.executeQuery("select * from employee");
		ResultSet rs = st.executeQuery("select Name,count(Name) as count_empname from Customer group by Name");
		//rs.first();
		//System.out.println(rs.getString("empname"));
		//System.out.println(rs.getString("Name"));
	    	List li = new ArrayList();
	    
			while(rs.next()) 
 			{ 			    
 			    //li.add(rs.getString("empname"));
				li.add(rs.getString("Name")+"-"+rs.getString("count_empname"));
 			}  
			
			String[] str = new String[li.size()];			
			Iterator it = li.iterator();
			
			int i = 0;
			while(it.hasNext())
			{
				String p = (String)it.next();	
				str[i] = p;
				i++;
			}

				String query = (String)request.getParameter("q");
				
				int cnt=1;
				for(int j=0;j<str.length;j++)
				{
					if(str[j].toUpperCase().startsWith(query.toUpperCase()))
					{
						out.print(str[j]+"\n");
						if(cnt>=5)
							break;
						cnt++;
					}
				}		
			
 		rs.close(); 
 		st.close(); 
		con.close();

		    } 
		catch(Exception e){ 
 			e.printStackTrace(); 
 		}

 %>