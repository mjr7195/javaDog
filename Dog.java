public class Dog {
    private String name;
    private String size;
    private String color;
    private Breed breed;

    public Dog (String name, String size, String color, DogBreed dogType){
        this.name = name;
        this.size = size;
        this.color = color;
        this.breed = new Breed(dogType);
    }
    //Getters
    public String getColor(){return color;}
    public String getSize(){return size;}

}





