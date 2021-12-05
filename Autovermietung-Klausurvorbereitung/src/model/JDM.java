package model;

public class JDM extends Fahrzeug{
    
    int _psGetuned;

    public JDM(String marke, String modell, int psGetuned, double leasingangebot){
        super(marke, modell, leasingangebot);
        setPsGetuned(_psGetuned);
    }
    // Methode, die überprüft, ob ein JDM Auto vermietet werden kann
    // Wennn die PS des JDM Autos größer sind als 1000 kann keins vermietet werden, weil die Autovermietung keine Autos mit mehr als 1000PS hat 
    public String vermieten(){
        if(getPsGetuned() >= 1000){
            return "Wir haben keine JDM Autos mit mehr als 1000PS";
        }
        else{
            return "Viel Spaß mit ihrem JDM Auto";
        }
    }
    // Methode, die überprüft ob JDM Autos geleast werden können
    public String leasingangebot(){
        return "Tut uns Leid, wir leasen keine JDM Autos.";
    }

    public int getPsGetuned() {
        return _psGetuned;
    }

    public void setPsGetuned(int _psGetuned) {
        this._psGetuned = _psGetuned;
    }

}
