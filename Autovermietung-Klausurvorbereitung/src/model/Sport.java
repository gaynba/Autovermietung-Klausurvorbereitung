package model;

public class Sport extends Fahrzeug {
    
    //
    int _ps;
    double _preis;

    // Constructor für Sportwagen 
    public Sport(String marke, String modell, int ps, double leasingpreisangebot, double preis){
        super(marke, modell, leasingpreisangebot);
        setPs(ps);
        setPreis(preis);
    }

    // Es werden nur Sportwagen mit min. 320PS vermietet, da die Autovermietung keine Sportwagen mit weniger als 320PS haben.
    public String vermieten(){
        if(getPs() <= 320){
            return "Sportwagen unter 320PS haben wir nicht!";
        }
        else{
            return "Viel Spaß mit ihrem Mietwagen";
        }

    }
    
    // Leasingangebot muss über 12.000€ liegen, damit ein Sportwagen geleased werden kann
    public String leasingangebot(){
        if(getLeasingpreisangebot() <= 12.000){
            return "Das min. Leasinangebot liegt bei 12.500.";
        }
        else{
            return "Hier sind die Schlüssel zu ihrem neuen Leasingfahrzeug.";
        }
    }

    // Methode für das mögliche Verkaufen eines Sportwagens
    // Die Autovermietung verkauft keine sportwagen
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
