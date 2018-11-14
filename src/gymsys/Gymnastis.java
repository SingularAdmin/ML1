
package gymsys;

public class Gymnastis {    
    private String onoma;
    private String eidikotita;
    
    
    public Gymnastis() {}
    
    public Gymnastis(String onoma, String eidikotita) {
        this.onoma = onoma;
        this.eidikotita = eidikotita;
    }
    
    public String getOnoma() {
        return onoma;
    }

    public String toString() {    
        String ektyp = ("\nONOMA: " + this.onoma + "  Ειδικότητα: " + this.eidikotita); 
        return ektyp;
    }
}
