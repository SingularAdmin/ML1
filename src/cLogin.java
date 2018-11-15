/**
 * @author DL
 */
public class cLogin 
{
    private final int _totalUsers = 30;
    private final User[] _users;
    private final DBconn _dataBase;
    
    public cLogin()
    {
        _users = new User[_totalUsers];
        _dataBase = new DBconn();
    }
    
   public void createU()
   {
        // admin
        char[] ps = {'a', 'd', 'm', 'i', 'n'};
        _users[0] = new User("admin", ps);
        
        // u1
        char[] ps1 = {'u', '1'};
        _users[1] = new User("u1", ps1);
      
        // u2
        char[] ps2 = {'u', '2'};
        _users[2] = new User("u2", ps2);
        _dataBase.getDBTable();
   }
   
   public User login(String userName, char[] passWord) throws UserNotFoundException
   {
       User u = new User();
       try
       {
           for (User user : _users)
           {
               if (user.getUserName().equals(userName))
               {
                   boolean match = Checkpw(user.getPassWord(), passWord);
                   if (match)
                   {
                       System.out.println("you are logged in as: " + user.getUserName());
                       return user;
                   }
               }
           }
       } 
       catch (UserNotFoundException e)
       {
           throw new UserNotFoundException(e.getMessage());
       }
      
      /*
       try 
       {
           u = db.getUser(un, pw.toString());
       }
       catch (UserNotFoundException e)
       {
           System.out.println(e.getMessage());
       }
      */
      throw new UserNotFoundException("User Not Found");
   } 

   private boolean Checkpw(char[] Upw,char[] pw)throws UserNotFoundException
   {
       for (int i= 0; i < Upw.length; i++)
       {
           if (Upw[i] == pw[i] && i == Upw.length-1)
               return true;
           else
               break;
       }
       
       throw new UserNotFoundException("wrong password");
   }
}
