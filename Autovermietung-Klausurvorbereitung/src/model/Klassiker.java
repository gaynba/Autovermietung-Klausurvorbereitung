package model;

public class Klassiker extends Fahrzeug{
    

    String _baujahr;

    public Klassiker(String marke, String modell, String baujahr){
        super(marke, modell);
        setBaujahr(baujahr);
    }

    public String vermieten(){
        if(getBaujahr() == "1971"){
            return "Wir haben keine Klassiker aus 1971.";
        }
        else if(getBaujahr() == "1967" || getBaujahr() == "1968" || getBaujahr() == "1970"){
            return "Viel Spaß mit ihrem Klassiker";
        }
        else{
            return "Wir haben nur Klassiker aus 1967, 1968 und 1970";
        }
    }

    public String getBaujahr() {
        return _baujahr;
    }

    public void setBaujahr(String _baujahr) {
        this._baujahr = _baujahr;
    }


}
