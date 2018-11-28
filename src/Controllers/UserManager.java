package Controllers;

import ExceptionHandling.IncorrectUserException;
import Model.User;
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
    private final String CONNECTION_QUERY = "jdbc:mariadb://localhost:3306/gym?user=root&password=123";
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
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next())
            {
                _users.add(new User(rs.getString("username"), rs.getString("password")));
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
    
    public User getUser(String userName)
    {
        for (User user : _users)
        {
            if (user.getUserName().equals(userName))
                return user;
        }
        
        return null;
    }
    
    public User login(String userName, String passWord) throws IncorrectUserException
    {
        User user = getUser(userName);
        if (user != null && user.getPassWord().equals(passWord))
            return user;
        
        throw new IncorrectUserException("Τα στοιχεία που εισάγατε δεν είναι σωστά");
    }
    
    public void register(String userName, String passWord, String name, String surName, String idNum, String dateOfBirth, String sex, long phoneNum, String email)
    {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection(CONNECTION_QUERY);     
            PreparedStatement stmt = con.prepareStatement("INSERT INTO users (username, password, name, surname, id_num, date_of_birth, sex, phone_num, email) VALUES (?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, userName);
            stmt.setString(2, passWord);
            stmt.setString(3, name);
            stmt.setString(4, surName);
            stmt.setString(5, idNum);
            stmt.setString(6, dateOfBirth);
            stmt.setString(7, sex);
            stmt.setLong(8, phoneNum);
            stmt.setString(9, email);
            
            stmt.execute();
            stmt.close();
            
            // Add user to our ArrayList.
            _users.add(new User(userName, passWord));
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
