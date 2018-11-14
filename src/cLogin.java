
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DL
 */
public class cLogin {
    private final int totalU = 30;
    private User[] users;
    DBconn db;
    cLogin(){
        users = new User[totalU];
        db = new DBconn();
    }
    
   public void createU(){
        //admin
        char[] ps = {'a','d','m','i','n'};
        users[0] = new User("admin",ps,true);
        
        //u1
        char[] ps1 = {'u','1'};
        users[1] = new User("u1",ps1,false);
      
        //u2
        char[] ps2 = {'u','2'};
        users[2] = new User("u2",ps2,false);
        db.getDBTable();
   }
   
   public User login(String un,char[] pw)throws UserNotFoundException{
       User u = new User();
       try {
           for(int i=0;i<users.length;i++){
              if(users[i].getUn().equals(un)){
                boolean match = Checkpw(users[i].getPasswd(),pw);
                  if(match){
                      System.out.println("you are logged in as: "+users[i].getUn());
                      return users[i];
                  }
              }
           }
       } catch (UserNotFoundException e) {
           throw new UserNotFoundException(e.getMessage());
       }
      
      /*
       try {
           u = db.getUser(un, pw.toString());
       } catch (UserNotFoundException e) {
           System.out.println(e.getMessage());
       }
      */
      throw new UserNotFoundException("User Not Found");
   } 

   private boolean Checkpw(char[] Upw,char[] pw)throws UserNotFoundException{
       for(int i=0; i<Upw.length;i++){
            if(Upw[i] == pw[i]){
                if(i == Upw.length-1){
                    return true;
                }
            }else{
                break;
            }
       }
       throw new UserNotFoundException("wrong password");
   }
}
