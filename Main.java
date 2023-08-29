public class Main {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Snoppy", "Large", "White", DogBreed.POODLE);
            Dog dog2 = new Dog("Spot", "Small", "White", DogBreed.BULLDOG);
            Dog  dog3 = new Dog("wolf", "Large", "Black and Orange", DogBreed.GERMAN_SHEPHERD);

            System.out.println("Dog color: " + dog1.getColor());
            System.out.println("Dog size; " + dog1.getSize());
        }



    }

