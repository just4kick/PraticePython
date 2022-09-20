package testpro;

import java.sql.*;


public class conn {

	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/alien";
		String uname="root";
		String pass="super";
		String query="insert into student value(7,'spiderman')";
		//String data="";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int count = st.executeUpdate(query);
//		ResultSet rs=st.executeQuery(query);
//		rs.next();
//		data = rs.getInt(1)+":"+rs.getString(2);
//		System.out.println(data);
//		rs.next();
//		data = rs.getInt(1)+":"+rs.getString(2);
//		System.out.println(data);
//		
//		while(rs.next()) {
//			
//			data = rs.getInt(1)+":"+rs.getString(2);
//			System.out.println(data);
//			
//			
//		}
		
		
		
		System.out.println(count);
		st.close();
		con.close();
		
		
		
	}
	
	
}
