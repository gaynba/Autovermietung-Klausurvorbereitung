package model;

public class Super extends Fahrzeug{
    
    String _maxgeschwindigkeit;
    double _vonNullaufHundert;

    public Super(String marke, String modell, String maxgeschwindigkeit, double vonNullaufHundert, double leasingangebot){
        super(marke, modell, leasingangebot);
        setMaxgeschwindigkeit(maxgeschwindigkeit);
        setVonNullaufHundert(vonNullaufHundert);
    }

    // Wenn die Zeit, in der das Supercar von null auf hundert geht über 3Sekunden ist und die max.geschw. unter 340Km/h liegt kein Supercar vermietet, da es keine Supercars mit diesen Eigenschaften bei dieser Autovermietung gibt
    public String vermieten(){
        if(getVonNullaufHundert() >= 3 && getMaxgeschwindigkeit() != "340 Km/h"){
            return "Unsere Supercars haben gehen alle von 0 auf 100 in unter 3 Sekunden und unter 340 Km/h";
        }
        else{
            return "Viel Spaß mit ihrem Supercar";
        }

    }
    // Es werden keine Supercars geleased
    public String leasingangebot(){
        return "Wir Leasen keine Supercars.";
    }
    // Methode für die Frage, ob die Autovermietung auch Supercars verkauft
    // es werden keine Supercars verkauft
    public String verkaufen(){
        return "Wir verkaufen keine Supercars!";
    }

    public String getMaxgeschwindigkeit() {
        return _maxgeschwindigkeit;
    }

    public void setMaxgeschwindigkeit(String _maxgeschwindigkeit) {
        this._maxgeschwindigkeit = _maxgeschwindigkeit;
    }

    public double getVonNullaufHundert() {
        return _vonNullaufHundert;
    }

    public void setVonNullaufHundert(double _vonNullaufHundert) {
        this._vonNullaufHundert = _vonNullaufHundert;
    }


}
