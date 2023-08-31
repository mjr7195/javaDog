public class Dog {
    private String name;
    private String size;
    private String color;
    private String furType;
    private int age;
    private double biteForce;
    private int lifeExpectancy;
    private Breed breed;
    //************************** constructors ********************************
    public Dog (String name, String size, String color, DogBreed dogType){
        this.name = name;
        this.size = size;
        this.color = color;
        this.breed = new Breed(dogType);
    }
    public Dog (String name, String size, int age, String furType, DogBreed dogType){
        this.name = name;
        this.size = size;
        this.age = age;
        this.furType = furType;
        this.breed = new Breed(dogType);
    }
    public Dog (String name,String size, double biteForce, int lifeExpectancy, DogBreed dogType){
        this.name = name;
        this.size = size;
        this.biteForce = biteForce;
        this.lifeExpectancy = lifeExpectancy;
        this.breed = new Breed(dogType);
    }
    //*************************** end constructors ******************************
    //******************** Methods ***********************
    public void bark() {
        System.out.println(name + " says: BARK!");
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void jump(){
        System.out.println(name + " is jumping.");
    }
    public void run(){
        System.out.println(name + " is running.");
    }
    public void play(){
        System.out.println(name + " is playing with toys.");
    }
    public void growl(){
        System.out.println(name + " is growling.");
    }
    //************ Methods *********************
    //************ Getters and Setters *************************
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public String getSize(){return size;}
    public void setSize(String size){this.size = size;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getAge() {
        return age;
    }
    public void setAge(int age){this.age = age;}
    public String getFurType(){return furType;}
    public void setFurType(String furType){this.furType = furType;}
    public double getBiteForce(){return biteForce;}
    public void setBiteForce(double biteForce){this.biteForce = biteForce;}
    public int getLifeExpectancy(){return lifeExpectancy;}
    public void setLifeExpectancy(int lifeExpectancy){this.lifeExpectancy = lifeExpectancy;}
    public Breed getBreedType(){return breed;}
//***************************end Getters and Setters *******************************

}





