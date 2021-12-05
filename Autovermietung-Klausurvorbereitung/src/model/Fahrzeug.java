package model;

// abstrakte Klasse, von der keine Instanzen erzeugt werden können
public abstract class Fahrzeug {
    
    String _marke;
    String _modell;
    double _leasingpreisangebot;
    
    // Constuctor
    public Fahrzeug(String marke, String modell, double leasingpreisangebot){
        setMarke(marke);
        setModell(modell);
        setLeasingpreisangebot(leasingpreisangebot);
    }


    // Abstrakte Methoden
    public abstract String vermieten();
    public abstract String leasingangebot();  

    
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

    public double getLeasingpreisangebot() {
        return _leasingpreisangebot;
    }

    public void setLeasingpreisangebot(double _leasingpreisangebot) {
        this._leasingpreisangebot = _leasingpreisangebot;
    }

}
