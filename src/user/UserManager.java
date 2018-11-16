package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author DL, Fakoukas
 */
public class UserManager 
{
    private List<User> _users;
    
    public UserManager()
    {
        _users = new ArrayList<User>();
        Connection con = null;
        
        try
        {
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test?user=root&password=123");     
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users");
            
            while (rs.next())
            {
                _users.add(new User(rs.getString("Username"), rs.getString("Passwd")));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            // Close the connection with the database.
            try
            {
                if (con != null)
                    con.close(); 
            }
            catch (Exception e)
            {
            }
        }
    }
    
   public User login(String userName, String passWord) throws IncorrectUserException
   {
       for (User user : _users)
       {
           if (user.getUserName().equals(userName) && user.getPassWord().equals(passWord))
               return user;
       }
       
       throw new IncorrectUserException("Τα στοιχεία που εισάγατε δεν είναι σωστά");
   }
}
