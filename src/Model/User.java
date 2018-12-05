package Model;

/**
 * @author DL, Fakou
 */
public class User
{
    private String _userName = "defaultUserName";
    private String _passWord = "defaultPassWd";
    private String Name ="default";
    private int ID = -1;
    private boolean _admin = false;
    
    public User()
    {
    
    }
    
    public User(String userName, String passWord)
    {
        _userName = userName;
        _passWord = passWord;
        if (_userName.equalsIgnoreCase("admin"))
            _admin = true;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
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

    @Override
    public String toString() {
        return "User{" + "Name:"+Name+", ID:"+ID+", _userName:" + _userName + ", _passWord:" + _passWord + ", _admin=" + _admin + '}';
    }
}