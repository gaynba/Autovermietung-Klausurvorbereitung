package model;

public class Elektro extends Fahrzeug{
    

    double _akkulaufzeit;

    public Elektro(String marke, String modell, double akkulaufzeit){
        super(marke, modell);
        setAkkulaufzeit(akkulaufzeit);

    }

    public String vermieten(){
        if(getAkkulaufzeit() < 30 || getAkkulaufzeit() > 36){
            return "Die Tesla Modelle die noch da sind haben nicht mehr als 36 Stunden Akkulaufzeit. der Roadster ist bereits ausgeliehen!";
        }
        else{
            return "Viel Spaß mit ihrem Tesla";
        }
    }


    public double getAkkulaufzeit() {
        return _akkulaufzeit;
    }

    public void setAkkulaufzeit(double _akkulaufzeit) {
        this._akkulaufzeit = _akkulaufzeit;
    }


}
