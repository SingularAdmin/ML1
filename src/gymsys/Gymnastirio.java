
package gymsys;
import java.util.ArrayList;

public class Gymnastirio {
    private String epwnymia;
    private String dieythynsi;
    private ArrayList <Gymnastis> gymnastes = new ArrayList<Gymnastis>();
    
    public Gymnastirio() {}
    
    public Gymnastirio(String onoma, String eidikotita) {
        this.epwnymia = onoma;
        this.dieythynsi = eidikotita;
    }
    
    public String getOnoma() {
        return epwnymia;
    }
    
    public void addGymnastis(Gymnastis gymn) {
        gymnastes.add(gymn);
    }
    
    public ArrayList<Gymnastis> getGymnastes(){
        return gymnastes;
          
    }
    
}
