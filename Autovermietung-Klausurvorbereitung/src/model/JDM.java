package model;

public class JDM extends Fahrzeug{
    
    int _psGetuned;

    public JDM(String marke, String modell, int psGetuned){
        super(marke, modell);
        setPsGetuned(_psGetuned);
    }

    public String vermieten(){
        if(getPsGetuned() >= 1000){
            return "Wir haben keine JDM Autos mit mehr als 1000PS";
        }
        else{
            return "Viel Spaß mit ihrem JDM Auto";
        }
    }

    public int getPsGetuned() {
        return _psGetuned;
    }

    public void setPsGetuned(int _psGetuned) {
        this._psGetuned = _psGetuned;
    }

}
