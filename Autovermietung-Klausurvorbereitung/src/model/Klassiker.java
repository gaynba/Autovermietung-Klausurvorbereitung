package model;

public class Klassiker extends Fahrzeug{
    

    String _baujahr;

    public Klassiker(String marke, String modell, String baujahr, double leasingangebot){
        super(marke, modell, leasingangebot);
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
    
    // Wenn das Leasingangebot unter 22.000€ liegt dann wird kein Klassiker geleased
    // Wenn es mehr als 22.000€ sind dann wird ein Klassiker geleased
    public String leasingangebot(){
        if(getLeasingpreisangebot() <= 22.000){
            return "Viel Spaß mit ihrem Klassiker Leasingfahrzeug";
        }
        else{
            return "Der Leasingpreis für einen Klassiker liegt bei min. 22.000€.";
        }
    }

    public String getBaujahr() {
        return _baujahr;
    }

    public void setBaujahr(String _baujahr) {
        this._baujahr = _baujahr;
    }


}
