package gymsys;

import DataManager.DBapi;
import java.util.ArrayList;

public class GymSys
{
    public static void main(String[] args)
    {
        /*
        Gymnastirio gym = new Gymnastirio("Ευεξία", "Θεμιστοκλέους 12" );
        
        gym.addGymnastis(new Gymnastis("Διομήδης", "Pilates")); 
        gym.addGymnastis(new Gymnastis("Καλλικράτης", "Πολεμικές τέχνες")); 
        
        ArrayList <Gymnastis> gymnastes = gym.getGymnastes();
        for (Gymnastis gymn : gymnastes)  
            System.out.println(gymn.getOnoma());  
    */
        
        DBapi api = new DBapi();
        Gymnastirio gym = new Gymnastirio("Ευεξία", "Θεμιστοκλέους 12" );
        gym.setGymnastes(api.getTrainers("SELECT * FROM trainer"));
        gym.print();
    }
}