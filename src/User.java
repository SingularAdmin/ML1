/**
 * @author DL
 */
public class User
{
    private String _userName;
    private String _passWord;
    private boolean _admin = false;

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

    public void setUserName(String userName)
    {
        _userName = userName;
    }

    public String getPassWord()
    {
        return _passWord;
    }

    public void setPassWord(String passWord)
    {
        _passWord = passWord;
    }

    public boolean isAdmin()
    {
        return _admin;
    }
}