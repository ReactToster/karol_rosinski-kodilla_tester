public class SimpleArray {
    public static void main(String[] args) {
        String[] animalSpecies = new String[] {"Dog", "Cat", "Squirrel", "Whale", "Bull"};
        String favouriteAnimal = animalSpecies[3];
        System.out.println(favouriteAnimal);
        int numberOfAnimalSpecies = animalSpecies.length;
        System.out.println("Number of elements in your array is: " + numberOfAnimalSpecies);
    }
}
