package oops;

class MULTIPLE_INHERITANCE{
    void puppyLover(){
        System.out.println("JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE");
    }
}

class Animal{
    private String name;
    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println("I am eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    private String breed;
    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    void bark(){
        System.out.println("DOg is barking");
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class Puppy extends Dog{
    private String puppyName;
    Puppy(String name, String breed, String puppyName){
        super(name, breed);
        this.puppyName = puppyName;
    }
    void puppyTime(){
        System.out.println("olla olla");
    }
    @Override
    void bark(){
        System.out.println("Puppy is  barking");
    }
    @Override
    void eat(){
        System.out.println("Time has not arrived for the puppy to eat");
    }
    public String getPuppyName() {
        return puppyName;
    }
    public void setPuppyName(String puppyName) {
        this.puppyName = puppyName;
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy("DOG","lab","bruno mars");
        p.eat();
        p.bark();
        p.puppyTime();

        Dog d = new Dog("DOG","xyz");
        d.bark();
        d.eat();

    }
}
