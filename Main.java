public class Main {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Snoppy", "Large", "White", DogBreed.POODLE);
            Dog dog2 = new Dog("Spot", "Small", 5, "Long", DogBreed.BULLDOG);
            Dog  dog3 = new Dog("wolf", "Large", 238, 8, DogBreed.GERMAN_SHEPHERD);

            System.out.println("Dog name: " + dog1.getName());
            System.out.println("Dog color: " + dog1.getColor());
            System.out.println("Dog size; " + dog1.getSize());
            System.out.println("Dog Breed: " + dog1.getBreedType());
        }



    }

