package org.example;

import org.example.Buildings.Enclosure;
import org.example.Buildings.Enclosures.SetupEnclosures;
import org.example.Buildings.Hospital;
import org.example.People.Handler;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args){
        ArrayList<Building> buildings = new ArrayList<>();
        ArrayList<Enclosure> enclosures = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Handler> handlers = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();

        SetupEnclosures setupEnclosures = new SetupEnclosures();
//        enclosures.addAll(setupEnclosures.setupAllEnclosure());
        Enclosure elephantEnclosure = setupEnclosures.setupElephantEnclosure();
        Enclosure rhinoENclosure = setupEnclosures.setupRhinoEnclosure();
        Handler handler1 = new Handler("Stacy", elephantEnclosure);
        Handler handler2 = new Handler("Betty", rhinoENclosure);
        handlers.add(handler1);
        handlers.add(handler2);
        Hospital hospital = new Hospital();
        HandlerModule handlerModule = new HandlerModule(handlers, hospital);
        handlerModule.run();



    }
}
