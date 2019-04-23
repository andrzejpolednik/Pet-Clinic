public class
PetClinic {
    private Animal[] animals;
    private int numberOfAnimals;

    PetClinic ()
    {
        animals = new Animal[20];
        numberOfAnimals = 0;
    }

    public boolean registerAnimal (Animal animal)
    {
        if (numberOfAnimals >= 20)
            return false;

        animals[numberOfAnimals++] = animal;
        return true;
    }

    public int costOfTreatment ()
    {
        int result = 0;
        for (int i=0; i < numberOfAnimals; i++)
            result += animals[i].getCost();
        return result;
    }

    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();

        clinic.registerAnimal(new Labrador(50));
        clinic.registerAnimal(new Persian(40));
        clinic.registerAnimal(new Dachshund(20));
        clinic.registerAnimal(new Bulldog(30));
        clinic.registerAnimal(new Labrador(30));
        clinic.registerAnimal(new Abyssinian(10));

        System.out.println("Cost of treatment: " + clinic.costOfTreatment() + "$");
    }
}
