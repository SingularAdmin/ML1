


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DL
 */
public class User {
    private String un;
    private char[] passwd;
    private boolean admin;

    public User(){}
    public User(String un, char[] passwd,boolean admin) {
        this.un = un;
        this.passwd = passwd;
        this.admin = admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }
    
    public String getUn() {
        return un;
    }

    public char[] getPasswd() {
        return passwd;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public void setPasswd(char[] passwd) {
        this.passwd = passwd;
    }
    
    
}
