package org.example.Buildings;

import org.example.Animal;
import org.example.Building;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Hospital extends Building {
    public ArrayList<Animal> admittedAnimals = new ArrayList<>();

    public void admitAnimal(Animal animal){
        admittedAnimals.add(animal);
    }
//    private ArrayList<animal> sickAnimals = new ArrayList<>();
//    //map so timestamps can be generated and accessible per animal
//    private Map<animal, LocalDateTime> healedAnimals = new HashMap<>();
//
//    public void viewSickAnimals(){
//        System.out.println("---Sick Animals Currently in Hospital---");
//        if (sickAnimals.isEmpty()){
//            System.out.println("There are currently no sick animals in the hospital!");
//        }
//        else{
//            for (animal a : sickAnimals){
//                System.out.println("-" + a.getAnimalName());
//            }
//        }
//    }
//
//    public void viewHealedAnimals(){
//        System.out.println("---Healed Animals with Timestamps---");
//        if (healedAnimals(isEmpty())){
//            System.out.println("No animals have been healed lately.");
//        }
//
//        //assumed getName() method from Animal class
//        else{
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            for (Map.Entry<Animal, LocalDateTime> entry : healedAnimals.entrySet()) {
//                System.out.printf(" %s (Healed at: %s)%n",
//                        entry.getKey().getName(),
//                        entry.getValue().format(formatter));
//            }
//        }
//
//    }
//    //not sure for lecture method but possible just a couple of souts
//    public void attendScienceLecture(){
//        System.out.println(Veterinarian.name + "is giving a science lecture!");
//        Veterinarian.lecture();
//        System.out.println("The lecture has ended. Thanks for listening!");
//    }
//}
//
////calling vet method here
//public void healAnimals(){
//    if (sickAnimals.isEmpty()){
//        System.out.println("Hooray, there are no sick animals admitted!");
//        return;
//        else {
//            System.out.println(Veterinarian.name + "is healing the animals...")
//            Veterinarian.heal();
//        }
//    }
//
//    //added function for admitting animals
//    public void admitAnimal(){
//        sickAnimals.add(animal);
//        System.out.println(animal + "has been admitted to the Hospital.");
//    }
//
//    public ArrayList<...> getSickAnimals(){
//        return sickAnimals;
//    }
//
//    public ArrayList<...> getHealedAnimals(){
//        return healedAnimals;
//    }
}
