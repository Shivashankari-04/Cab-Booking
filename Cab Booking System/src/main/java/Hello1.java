import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Hello1 {
		String dbUrl="jdbc:mysql://localhost:3306/miniproject";
	    String dbUname="root";
	    String dbPassword="";
	    String dbDriver="com.mysql.cj.jdbc.Driver";
		String customerName,mobileNumber,pickupAddress,dropAddress,pickupdate,pickupTime;
		
		
		Hello1(String customerName,String mobileNumber,String pickupAddress,String dropAddress,String pickupdate, String pickupTime){
		this.customerName=customerName;
		this.mobileNumber=mobileNumber;
		this.pickupAddress=pickupAddress;
		this.dropAddress=dropAddress;
		this.pickupdate=pickupdate;
		this.pickupTime=pickupTime;
		
		
	}
	void store() {
		Connection con = null;
   		try {
			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			String sql = "insert into car (name,number,pickup,cardrop,pdate,ptime)values('"+customerName+"','"+mobileNumber+"','"+pickupAddress+"','"+dropAddress+"','"+pickupdate+"','"+pickupTime+"')";
// 		    String sql="select * from student";
			Statement s = con.createStatement();
			s.execute(sql);
		   
		   	con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}