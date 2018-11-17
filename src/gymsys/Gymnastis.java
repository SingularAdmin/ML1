package gymsys;

public class Gymnastis
{    
    private String _onoma;
    private String _eidikotita;
    
    public Gymnastis()
    {
    }
    
    public Gymnastis(String onoma, String eidikotita)
    {
        _onoma = onoma;
        _eidikotita = eidikotita;
    }
    
    public String getOnoma()
    {
        return _onoma;
    }
    
    @Override
    public String toString()
    {
        return "\nONOMA: " + _onoma + "  Ειδικότητα: " + _eidikotita;
    }
}