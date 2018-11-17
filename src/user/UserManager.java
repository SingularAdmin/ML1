package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author DL, Fakou
 */
public class UserManager 
{
    private final String CONNECTION_QUERY = "jdbc:mariadb://localhost:3306/test?user=root&password=123";
    private List<User> _users;
    
    public static final UserManager getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
    
    private UserManager()
    {
        _users = new ArrayList<User>();
        Connection con = null;
        
        try
        {
            con = DriverManager.getConnection(CONNECTION_QUERY);     
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Users");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next())
            {
                _users.add(new User(rs.getString("Username"), rs.getString("Passwd")));
            }
            
            rs.close();
            stmt.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Η σύνδεση με τη βάση δεδομένων δεν ήταν επιτυχής. Παρακαλώ επιβεβαιώστε ότι έχετε το MariaDB εγκαταστατημένο και υπάρχει ο πίνακας users.", "Πρόβλημα κατά τη Σύνδεση", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, e);
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
    
    public void register(String userName, String passWord)
    {
        Connection con = null;
        
        try
        {
            con = DriverManager.getConnection(CONNECTION_QUERY);     
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Users (Username, Passwd) VALUES (?,?)");
            stmt.setString(1, userName);
            stmt.setString(2, passWord);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Η σύνδεση με τη βάση δεδομένων δεν ήταν επιτυχής. Παρακαλώ επιβεβαιώστε ότι έχετε το MariaDB εγκαταστατημένο και υπάρχει ο πίνακας users.", "Πρόβλημα κατά τη Σύνδεση", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, e);
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
    
    private static class SingletonHolder
    {
        protected static final UserManager INSTANCE = new UserManager();
    }
}
