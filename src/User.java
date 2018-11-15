/**
 * @author DL
 */
public class User
{
    private String _userName;
    private char[] _passWord;
    private boolean _admin;

    public User()
    {
    }
    
    public User(String userName, char[] passWord)
    {
        _userName = userName;
        _passWord = passWord;
        if (_userName.equalsIgnoreCase("admin"))
            _admin = true;
    }

    public boolean isAdmin()
    {
        return _admin;
    }
    
    public String getUserName()
    {
        return _userName;
    }

    public void setUserName(String userName)
    {
        _userName = userName;
    }

    public char[] getPassWord()
    {
        return _passWord;
    }

    public void setPassWord(char[] passWord)
    {
        _passWord = passWord;
    }
}
