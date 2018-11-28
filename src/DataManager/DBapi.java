package DataManager;

import ExceptionHandling.ExceptionHandler;
import gymsys.Gymnastis;
import java.sql.*;
import java.util.ArrayList;
import Model.User;

/**
 * @author DL
 * UNUSED AT THE MOMENT
 */
public class DBapi
{
    private final String CONNECTION_QUERY = "jdbc:mariadb://localhost:3306/gym?user=root&password=123";
    private Connection connection = null;
    private Statement stmt;
    private ResultSet resultset;
    private ExceptionHandler EH;
    private ResultSetMetaData resultsetmetadata;
    
    public DBapi()
    {
        try
        {
            connection = DriverManager.getConnection(CONNECTION_QUERY);
        }
        catch (SQLException ex)
        {
           EH = new ExceptionHandler(ex);
        }
    }
    
    public void getUserTable()
    {
    }
    
    public void insertUser(String Query)
    {
    }
    
    public User getUser(String Username, String passwd)
    {
        User u = new User();
        return u;
    }
    
    public void deleteUser(String username)
    {
    }
    
    public ArrayList<Gymnastis> getTrainers(String query)
    {
        ArrayList<Gymnastis> gymnastes = new ArrayList();
        try
        {
            stmt = connection.createStatement();
            stmt.executeQuery(query);
            resultset = stmt.getResultSet();
            while (resultset.next())
            {
                gymnastes.add(new Gymnastis(resultset.getString("name"),resultset.getString("speciality")));
            }
        }
        catch (SQLException ex)
        {
            EH = new ExceptionHandler("gymnastes table sql error");
        }
        return gymnastes;
    }
    
    private ArrayList<Object> getUser(String query)
    {
        ArrayList<Object> u = new ArrayList();
        try
        {
            stmt = connection.createStatement();
            stmt.executeQuery(query);
            resultset = stmt.getResultSet();
            resultsetmetadata = resultset.getMetaData();
            
            while (resultset.next())
            {
                u.add(new Gymnastis(resultset.getString("name"), resultset.getString("speciality")));
            }
        }
        catch (SQLException ex)
        {
            EH = new ExceptionHandler("gymnastes table sql error");
        }
        return u;
    }
}
