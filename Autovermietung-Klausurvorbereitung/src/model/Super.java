package model;

public class Super extends Fahrzeug{
    
    String _maxgeschwindigkeit;
    double _vonNullaufHundert;

    public Super(String marke, String modell, String maxgeschwindigkeit, double vonNullaufHundert){
        super(marke, modell);
        setMaxgeschwindigkeit(maxgeschwindigkeit);
        setVonNullaufHundert(vonNullaufHundert);
    }


    public String vermieten(){
        if(getVonNullaufHundert() >= 3 && getMaxgeschwindigkeit() != "340 Km/h"){
            return "Unsere Supercars haben gehen alle von 0 auf 100 in unter 3 Sekunden und unter 340 Km/h";
        }
        else{
            return "Viel Spaß mit ihrem Supercar";
        }

    }

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
