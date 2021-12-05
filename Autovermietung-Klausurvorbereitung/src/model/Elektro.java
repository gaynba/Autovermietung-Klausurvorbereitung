package model;

public class Elektro extends Fahrzeug{
    

    double _akkulaufzeit;

    public Elektro(String marke, String modell, double akkulaufzeit, double leasingangebot){
        super(marke, modell, leasingangebot);
        setAkkulaufzeit(akkulaufzeit);

    }

    // Methode vermieten, die überprüft ob es Elektroautos gibt mit einer Akkulaufzeit unter 30h und über 36h. 
    // Die Elektroautos, die die Autovermietung hat haben eine Akkulaufzeit zwischen 30 und 36 Stunden, es kann kein Auto vermietet werden mit niedrigerer oder höherer Akkulaufzeit
    public String vermieten(){
        if(getAkkulaufzeit() < 30 || getAkkulaufzeit() > 36){
            return "Die Tesla Modelle die noch da sind haben nicht mehr als 36 Stunden Akkulaufzeit. der Roadster ist bereits ausgeliehen!";
        }
        else{
            return "Viel Spaß mit ihrem Tesla";
        }
    }
    // Wenn das Leasingpreisangebot niedrieger ist als 12.400 kann kein Elektroauto geleased werden, weil der Preis für das Leasen bei 12.450€ liegt.
    public String leasingangebot(){
        if(getLeasingpreisangebot() <= 12.400){
            return "suchen sie sich einen Tesla aus.";
        }
        else{
            return "Tut uns Leid der Leasingpreis für einen Tesla liegt bei 12.450€.";
        }
    }

    // Setter und Getter
    public double getAkkulaufzeit() {
        return _akkulaufzeit;
    }

    public void setAkkulaufzeit(double _akkulaufzeit) {
        this._akkulaufzeit = _akkulaufzeit;
    }


}
