public class Main {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Snoppy", "Large", "White", DogBreed.POODLE);
            Dog dog2 = new Dog("Spot", "Small", 5, "Long", DogBreed.BULLDOG);
            Dog  dog3 = new Dog("wolf", "Large", 238, 8, DogBreed.GERMAN_SHEPHERD);
            //Dog1
            dog1.setName("doug");
            dog1.setSize("small");
            dog1.setColor("Grey and white");
            System.out.println("Dog name: " + dog1.getName());
            System.out.println("Dog size; " + dog1.getSize());
            System.out.println("Dog color: " + dog1.getColor());
            System.out.println("Dog Breed: " + dog1.getBreedType());
            dog1.bark();
            dog1.eat();
            System.out.println();//to skip line for better display
            //Dog2
            dog2.setName("Sam");
            dog2.setSize("extra large");
            dog2.setAge(10);
            dog2.setFurType("curly");
            System.out.println("Dog name: " + dog2.getName());
            System.out.println("Dog size; " + dog2.getSize());
            System.out.println("Dog age: " + dog2.getAge());
            System.out.println("Dog fur type: " + dog2.getFurType());
            System.out.println("Dog Breed: " + dog2.getBreedType());
            dog2.jump();
            dog2.play();
            System.out.println();//to skip line for better display
            //Dog3
            dog3.setName("Cuddles");
            dog3.setSize("Medium");
            dog3.setBiteForce(300);
            dog3.setLifeExpectancy(20);
            System.out.println("Dog name: " + dog3.getName());
            System.out.println("Dog size; " + dog3.getSize());
            System.out.println("Dog bite force: " + dog3.getBiteForce());
            System.out.println("Dog life expectancy: " + dog3.getLifeExpectancy() + " Year(s)");
            System.out.println("Dog Breed: " + dog3.getBreedType());
            dog3.run();
            dog3.growl();
            System.out.println();//to skip line for better display

        }



    }

