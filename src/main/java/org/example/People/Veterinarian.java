package org.example.People;

import org.example.Animal;
import org.example.Building;
import org.example.Buildings.Hospital;
import org.example.Person;

public class Veterinarian extends Person {

    public Veterinarian(String name) {
        super(name);
    }

    public void heal(Animal animal){
        animal.setHealth(true);
    }

    public void lecture() {
        System.out.println("");
        System.out.println("👋 Hi there! I'm Dr. " + this.name + ", the zoo's veterinarian.");
        System.out.println("I make sure every animal here stays strong, healthy, and happy!");

        System.out.println("\n📢 Did you know?");
        System.out.println("- Elephants can recognize themselves in mirrors — that’s a sign of intelligence!");
        System.out.println("- Cheetahs don’t roar like lions. Instead, they purr, hiss, and even chirp!");
        System.out.println("- Owls can rotate their heads almost 270 degrees without hurting themselves!");

        System.out.println("\nTaking care of animals isn’t just about healing — it’s about understanding them too!");
        System.out.println("So keep your eyes open and your curiosity alive. Nature is full of surprises!");
        System.out.println("");
    }

}
