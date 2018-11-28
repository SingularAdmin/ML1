package Model;

/**
 * @author DL, Fakou
 */
public class User
{
    private final String _userName;
    private final String _passWord;
    private boolean _admin = false;
    
    public User()
    {
        _userName = "";
        _passWord = "";
    }
    
    public User(String userName, String passWord)
    {
        _userName = userName;
        _passWord = passWord;
        if (_userName.equalsIgnoreCase("admin"))
            _admin = true;
    }
    
    public String getUserName()
    {
        return _userName;
    }

    public String getPassWord()
    {
        return _passWord;
    }

    public boolean isAdmin()
    {
        return _admin;
    }
}