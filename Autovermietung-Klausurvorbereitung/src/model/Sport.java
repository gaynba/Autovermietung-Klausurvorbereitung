package model;

public class Sport extends Fahrzeug {
    
    //
    int _ps;
    double _preis;

    // Constructor für Sportwagen 
    public Sport(String marke, String modell, int ps, double preis){
        super(marke, modell);
        setPs(ps);
        setPreis(preis);
    }


    public String vermieten(){
        if(getPs() <= 320){
            return "Sportwagen unter 320PS haben wir nicht!";
        }
        else{
            return "Viel Spaß mit ihrem Mietwagen";
        }

    }

    public String verkaufen(){
        return "wir verkaufen keine Sportwagen";        
    }

    // Getter und Setter
    public int getPs() {
        return _ps;
    }

    public void setPs(int _ps) {
        this._ps = _ps;
    }

    public double getPreis() {
        return _preis;
    }

    public void setPreis(double _preis) {
        this._preis = _preis;
    }



}
