import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBconn {
    private  Connection conn;
    private  Statement stmt; 
    DBconn(){
          try {
             conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test?user=root&password=123");
        } catch (SQLException ex) {
            Logger.getLogger(DBconn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDBTable(){
        String query = "SELECT * FROM Users";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String un = rs.getString("Username");
                String pw = rs.getString("Passwd");
                System.out.println("UserName: "+un+" Password: "+pw);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getUser(String un,String pw) throws UserNotFoundException{
        User u = new User();
        String query = "SELECT Username\n" +
                        "FROM users\n" +
                        "WHERE Username = "+un+" AND Passwd = "+pw ;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            /*
            while(rs.next()){
                if(rs.getString("Username") == un && rs.getString("Passwd") == pw){
                    un = rs.getString("Username");
                    pw = rs.getString("Passwd");
                    u.setUn(un);
                    u.setPasswd(pw.toCharArray());
                    return u;
                }else{
                    throw new UserNotFoundException("User Not Found in DB");
                }
                
            }
            */
            if(rs.next()){
                u.setUn(rs.getString("Username"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return u;
    }
}
