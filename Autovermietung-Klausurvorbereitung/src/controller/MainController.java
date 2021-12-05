package controller;

import model.*;
import view.Output;
import java.util.ArrayList;



public class MainController {

    public void Demodata(){

        // Arraylists für alle Fahrzeuge und jeweils eine für nur Sportwagen und Supercars
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
        ArrayList<Super> superautos = new ArrayList<Super>();
        ArrayList<Sport> sportwagen = new ArrayList<Sport>(); 

        //Demodaten
        Super s1 = new Super("Ferrari", "SF90 Stradale", "340 Km/h", 2.5, 24.000);
        Super s2 = new Super("McLaren", "720S", "340 Km/h", 2.9, 22.000);
        Super s3 = new Super("Ferrari", "F8 Tributo", "340 Km/h", 2.9, 25.000);
        fahrzeuge.add(s1);
        fahrzeuge.add(s2);
        fahrzeuge.add(s3);
        Sport sp1 = new Sport("Porsche", "911", 600, 15.000, 111.000);
        Sport sp2 = new Sport("Porsche", "Taycan", 620, 12.500, 85.000);
        Sport sp3 = new Sport("Mercedes", "AMG GT", 730, 14.000, 96.000);
        fahrzeuge.add(sp1);
        fahrzeuge.add(sp2);
        fahrzeuge.add(sp3);
        Klassiker k1 = new Klassiker("Ford", "Mustang", "1967", 30.000);
        Klassiker k2 = new Klassiker("Dodge", "Charger", "1970", 25.000);
        Klassiker k3 = new Klassiker("Ford", "Mustang", "1968", 22.000);
        fahrzeuge.add(k1);
        fahrzeuge.add(k2);
        fahrzeuge.add(k3);
        JDM j1 = new JDM("Nissan", "Skyline GTR R34", 400, 10.350);
        JDM j2 = new JDM("Toyota", "Supra Mk.4", 1000, 11.120);
        JDM j3 = new JDM("Toyota", "Supra Mk.5", 500, 5.360);
        fahrzeuge.add(j1);
        fahrzeuge.add(j2);
        fahrzeuge.add(j3);
        Elektro e1 = new Elektro("Tesla", "Model X", 32.5, 12.450);
        Elektro e2 = new Elektro("Tesla", "Model 3", 35.5, 12.450);
        Elektro e3 = new Elektro("Tesla", "Roadster", 40, 12.450);
        fahrzeuge.add(e1);
        fahrzeuge.add(e2);
        fahrzeuge.add(e3);
        
        // Erstellen eines Outputs
        Output o = new Output();



        // Für die Ausgabe, dass er die Ergebnisse der überprüften Methoden ausgibt
        for(Fahrzeug fahrzeug : fahrzeuge){
            o.printData(fahrzeug.vermieten());
        }

        for(Fahrzeug fahrzeug : fahrzeuge){
            o.printData(fahrzeug.leasingangebot());
        }

        for (Super superauto : superautos){
            o.printData(superauto.verkaufen());
        }

        for(Sport sport : sportwagen){
            o.printData(sport.verkaufen());
        }

        

    }



}
