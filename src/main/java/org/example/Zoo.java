package org.example;

import org.example.Buildings.Hospital;
import org.example.People.Veterinarian;
import org.example.Species.Birds.Parrot;
import org.example.Species.Felines.Cheetah;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Building> buildings;
    private ArrayList<Person> persons;
    private ArrayList<Animal> animals;

    private VeterinarianModule veterinarianModule;
    private ShopModule shopModule;

    public Zoo() {
        buildings = new ArrayList<>();
        persons = new ArrayList<>();
        animals = new ArrayList<>();

        setupSampleData();
        shopModule = new ShopModule();
    }

    private void setupSampleData() {
        // Create a hospital and add to buildings
        Hospital hospital = new Hospital();
        buildings.add(hospital);

        // Create and add a veterinarian
        Veterinarian vet = new Veterinarian("Dr. Rick");
        persons.add(vet);

        // Create sick animals and add to vet module + zoo list
        Animal sickParrot = new Parrot("Ivan", false, hospital);
        Animal sickCheetah = new Cheetah("Garreth", false, hospital);

        animals.add(sickParrot);
        animals.add(sickCheetah);

        veterinarianModule = new VeterinarianModule();
        veterinarianModule.admitAnimal(sickParrot);
        veterinarianModule.admitAnimal(sickCheetah);
    }

    private void viewAllAnimals() {
        System.out.println("--- All Animals in Zoo ---");
        for (Animal a : animals) {
            System.out.printf("%s [%s]%n", a.getName(), a.isHealthy() ? "Healthy" : "Sick");
        }
    }

    private void runSimulation() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Welcome to the Zoo Simulation ===");
            System.out.println("1. Enter Hospital Monitor");
            System.out.println("2. Enter Zoo Shop");
            System.out.println("3. View All Animals");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> veterinarianModule.executeHospital();
                case 2 -> shopModule.start();
                case 3 -> viewAllAnimals();
                case 4 -> System.out.println("Exiting zoo simulation...");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.runSimulation();
    }
}
