package Controllers;

import Model.*;
import View.UISubscription;
import java.util.Date;

/**
 * @author DL
 */
public class CSubscription
{
    private UISubscription Sub;
    public CSubscription()
    {
      Sub = new UISubscription(); 
    }
    
    public void newSubscription(User u,double cost){
    Subscriber s = (Subscriber)u;
    s.setSubscription(new Subscription());
    //System.out.println("sub: "+((Subscriber)u).getPassWord());
    }
}
