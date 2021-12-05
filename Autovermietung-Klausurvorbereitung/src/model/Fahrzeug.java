package model;

public abstract class Fahrzeug {
    
    String _marke;
    String _modell;
    

    public Fahrzeug(String marke, String modell){
        setMarke(marke);
        setModell(modell);
    }

    public abstract String vermieten();    

    //public abstract String verkaufen();

    // Getter und Setter
    public String getMarke() {
        return _marke;
    }

    public void setMarke(String _marke) {
        this._marke = _marke;
    }

    public String getModell() {
        return _modell;
    }

    public void setModell(String _modell) {
        this._modell = _modell;
    }


}
