package org.example.Buildings.Enclosures;

import org.example.Animal;
import org.example.Buildings.Enclosure;
import org.example.Species.Birds.*;
import org.example.Species.Felines.*;
import org.example.Species.Pachyderms.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetupEnclosures {
    public BirdEnclosure falconEnclosure = new BirdEnclosure();
    public ArrayList<Animal> falcons = new ArrayList<>();

    public BirdEnclosure owlEnclosure = new BirdEnclosure();
    public ArrayList<Animal> owls = new ArrayList<>();

    public BirdEnclosure parrotEnclosure = new BirdEnclosure();
    public ArrayList<Animal> parrots = new ArrayList<>();

    public FelineEnclosure lionEnclosure = new FelineEnclosure();
    public ArrayList<Animal> lions = new ArrayList<>();

    public FelineEnclosure tigerEnclosure = new FelineEnclosure();
    public ArrayList<Animal> tigers = new ArrayList<>();

    public FelineEnclosure cheetahEnclosure = new FelineEnclosure();
    public ArrayList<Animal> cheetahs = new ArrayList<>();

    public PachydermEnclosure rhinoEnclosure = new PachydermEnclosure();
    public ArrayList<Animal> rhinos = new ArrayList<>();

    public PachydermEnclosure hippoEnclosure = new PachydermEnclosure();
    public ArrayList<Animal> hippos = new ArrayList<>();

    public PachydermEnclosure elephantEnclosure = new PachydermEnclosure();
    public ArrayList<Animal> elephants = new ArrayList<>();

    public Enclosure setupOwlEnclosure() {
        this.owls.add(new Owl("Hedwig", false));
        this.owls.add(new Owl("Nightwatch", true));
        this.owlEnclosure.setAnimals(this.owls);
        for (Animal animal: this.owls){
            animal.setLocation(owlEnclosure);
            animal.setEnclosure(owlEnclosure);
        }
        return this.owlEnclosure;
    }

    public Enclosure setupParrotEnclosure() {
        this.parrots.add(new Parrot("Polly", true));
        this.parrots.add(new Parrot("Captain", false));
        this.parrotEnclosure.setAnimals(this.parrots);
        for (Animal animal: this.parrots){
            animal.setLocation(parrotEnclosure);
            animal.setEnclosure(parrotEnclosure);
        }
        return this.parrotEnclosure;
    }

    public Enclosure setupFalconEnclosure(){
        this.falcons.add(new Falcon("Murica", true));
        this.falcons.add(new Falcon("Freedom", true));
        this.falconEnclosure.setAnimals(this.falcons);
        for (Animal animal: this.falcons){
            animal.setLocation(falconEnclosure);
            animal.setEnclosure(falconEnclosure);
        }
        return this.falconEnclosure;
    }

    public Enclosure setupLionEnclosure() {
        this.lions.add(new Lion("Simba", true));
        this.lions.add(new Lion("Mufasa", true));
        this.lionEnclosure.setAnimals(this.lions);
        for (Animal animal: this.lions){
            animal.setLocation(lionEnclosure);
            animal.setEnclosure(lionEnclosure);
        }
        return this.lionEnclosure;
    }

    public Enclosure setupTigerEnclosure() {
        this.tigers.add(new Tiger("Shere Khan", false));
        this.tigers.add(new Tiger("Rajah", true));
        this.tigerEnclosure.setAnimals(this.tigers);
        for (Animal animal: this.lions){
            animal.setLocation(lionEnclosure);
            animal.setEnclosure(lionEnclosure);
        }
        return this.tigerEnclosure;
    }

    public Enclosure setupCheetahEnclosure() {
        this.cheetahs.add(new Cheetah("Dash", true));
        this.cheetahs.add(new Cheetah("Flash", true));
        this.cheetahEnclosure.setAnimals(this.cheetahs);
        for (Animal animal: this.cheetahs){
            animal.setLocation(cheetahEnclosure);
            animal.setEnclosure(cheetahEnclosure);
        }
        return this.cheetahEnclosure;
    }

    public Enclosure setupRhinoEnclosure() {
        this.rhinos.add(new Rhino("Ranger", true));
        this.rhinos.add(new Rhino("Hornbill", false));
        this.rhinoEnclosure.setAnimals(this.rhinos);
        for (Animal animal: this.rhinos){
            animal.setLocation(rhinoEnclosure);
            animal.setEnclosure(rhinoEnclosure);
        }
        return this.rhinoEnclosure;
    }

    public Enclosure setupHippoEnclosure() {
        this.hippos.add(new Hippo("Gloria", true));
        this.hippos.add(new Hippo("Muddy", false));
        this.hippoEnclosure.setAnimals(this.hippos);
        for (Animal animal: this.hippos){
            animal.setLocation(hippoEnclosure);
            animal.setEnclosure(hippoEnclosure);
        }
        return this.hippoEnclosure;
    }

    public Enclosure setupElephantEnclosure() {
        this.elephants.add(new Elephant("Dumbo", true));
        this.elephants.add(new Elephant("Tusko", true));
        this.elephants.add(new Elephant("Tusko Jr.", true));
        this.elephantEnclosure.setAnimals(this.elephants);
        for (Animal animal: this.elephants){
            animal.setLocation(elephantEnclosure);
            animal.setEnclosure(elephantEnclosure);
        }
        return this.elephantEnclosure;
    }

    public HashMap<String, Enclosure> setupAllEnclosure() {
        HashMap<String, Enclosure> enclosures = new HashMap<>();

        enclosures.put("owl", this.setupOwlEnclosure());
        enclosures.put("parrot", this.setupParrotEnclosure());
        enclosures.put("falcon", this.setupFalconEnclosure());
        enclosures.put("lion", this.setupLionEnclosure());
        enclosures.put("tiger", this.setupTigerEnclosure());
        enclosures.put("cheetah", this.setupCheetahEnclosure());
        enclosures.put("rhino", this.setupRhinoEnclosure());
        enclosures.put("hippo", this.setupHippoEnclosure());
        enclosures.put("elephant", this.setupElephantEnclosure());

        return enclosures;
    }

}
