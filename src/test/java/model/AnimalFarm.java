package model;

import model.constants.Animal;

import java.util.*;

public class AnimalFarm {

    private List<String> farmAnimals;

    public AnimalFarm(List<String> farmAnimals){
        this.farmAnimals = farmAnimals;
    }

    public Map<String, Integer> countedAnimals(){
        Map<String, Integer> animalCounts = new HashMap<>();

        for (String animalType : farmAnimals){
            try {
                animalCounts.merge(animalType, 1, Integer::sum);
            } catch (IllegalArgumentException e){
                System.out.println("Please correct string [" + animalType + "]. Incorrect input data.");
            }
        }

        return  animalCounts;
    }

    public Set<String> uniqueNames(){
        Set<String> animalName = new HashSet<>();
        for ( String line : farmAnimals) {
            String[] parts = line.split("\\s+");
               if (parts.length < 2){
                   System.out.println("Please correct string " + line + ". Incorrect input data.");
                   continue;
               }
                   String name = parts[1];
                   animalName.add(name);

            }
        return animalName;
    }

    public void addAnimal (Animal type, String name ){
      farmAnimals.add(type.name() + " " + name);
    }

    public void addAnimal(Animal type){
        farmAnimals.add(type.name() + " " + "N");
    }

    public void addFarmAnimal(String name) {
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ":");
            stringBuilder.append(printFarmAnimal).append("\n");
        }

        return stringBuilder.toString();
    }




}
