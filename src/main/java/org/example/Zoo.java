package org.example;

import org.example.Buildings.Enclosure;
import org.example.Buildings.Enclosures.SetupEnclosures;
import org.example.Buildings.Hospital;
import org.example.People.Handler;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    public static void main(String[] args){
        ArrayList<Building> buildings = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Handler> handlers = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();

        SetupEnclosures setupEnclosures = new SetupEnclosures();
        HashMap<String, Enclosure> enclosures = setupEnclosures.setupAllEnclosure();

        Handler handler1 = new Handler("Stacy", enclosures.get("elephant"));
        Handler handler2 = new Handler("Betty", enclosures.get("rhino"));
        handlers.add(handler1);
        handlers.add(handler2);
        Hospital hospital = new Hospital();
        HandlerModule handlerModule = new HandlerModule(handlers, hospital);
//        handlerModule.run();

        EnclosureModule enclosureModule = new EnclosureModule(enclosures);
        enclosureModule.run();


    }
}
