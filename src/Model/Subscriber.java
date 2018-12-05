/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DL
 */
public class Subscriber extends User
{
    private Subscription sub;
    public Subscriber(){
        super();
    }
    
    public void setSubscription(Subscription sub){
        this.sub = sub;
    }
    public Subscription getSubscription(){
        return sub;
    }

    @Override
    public String toString() {
        return "Subscriber:" + super.toString() + sub ;
    }
    
}
