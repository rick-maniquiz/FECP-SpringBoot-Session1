package org.example;

import org.example.Buildings.Enclosure;
import org.example.Buildings.Hospital;
import org.example.People.Handler;
import org.example.People.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

//public class Zoo {
//
//    public static void main(String[] args){
//        ArrayList<Building> buildings = new ArrayList<>();
//        ArrayList<Person> persons = new ArrayList<>();
//        ArrayList<Handler> handlers = new ArrayList<>();
//        ArrayList<Animal> animals = new ArrayList<>();
//
//        SetupEnclosures setupEnclosures = new SetupEnclosures();
//        HashMap<String, Enclosure> enclosures = setupEnclosures.setupAllEnclosure();
//
//        Handler handler1 = new Handler("Stacy", enclosures.get("elephant"));
//        Handler handler2 = new Handler("Betty", enclosures.get("rhino"));
//        handlers.add(handler1);
//        handlers.add(handler2);
//        Hospital hospital = new Hospital();
//        HandlerModule handlerModule = new HandlerModule(handlers, hospital);
////        handlerModule.run();
//
//        EnclosureModule enclosureModule = new EnclosureModule(enclosures);
//        enclosureModule.run();

//import TicketingModule

public class Zoo {
    private final ArrayList<Visitor> visitorsWithTickets = new ArrayList<>();
    ArrayList<Handler> handlers = new ArrayList<>();
    HashMap<String, Enclosure> enclosures;
    Hospital hospital;
    ArrayList<Building> buildings;
    private final ArrayList<Person> people = new ArrayList<>();
    ArrayList<Animal> animals;
    private boolean isZooOpen;

    public void setHospital(Hospital hospital){
        this.hospital = hospital;
    }

    public Hospital getHospital(){
        return this.hospital;
    }


    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }

    public ArrayList<Handler> getHandlers(){
        return this.handlers;
    }

    public void setEnclosures(HashMap<String, Enclosure> enclosures){
        this.enclosures = enclosures;
    }

    public void addVisitorWithTicket(Visitor visitor) {
        this.visitorsWithTickets.add(visitor);
    }

    public boolean isTicketCodeValid(String code) {
        return visitorsWithTickets.stream().anyMatch(v -> v.getTicketCode().equalsIgnoreCase(code));
    }

    public void setZooOpen(boolean isOpen) {
        this.isZooOpen = isOpen;
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }



}


