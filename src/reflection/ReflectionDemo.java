package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Animal{
    protected String name;
    private int age;
    public String eat;

    public Animal(){};
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
    private void sleep(){
        System.out.println("Sleeping");
    }
}
class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    public void wagTail(){
        System.out.println("Dog wagging Tail");
    }
}
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // Method 1 :- using .class syntax
        Class<String> stringClass1 =  String.class;

        //method 2 :- using class.forName()
        Class<?> stringClass2 = Class.forName("java.lang.String");

        //Method 3 :- using getClass() method
        String str = "Hello";
        Class<?> stringClass3 = str.getClass();

        //Method 4: for primitive types
        Class<Integer> intClass = int.class;
        Class<Integer> integerClass = Integer.class;

        System.out.println("class name " + stringClass1.getName());
        System.out.println("class Simple Name " + stringClass1.getSimpleName());
        System.out.println("package name: " + stringClass1.getPackage().getName());
        System.out.println("is interface " + stringClass1.isInterface());
        System.out.println("is Array " + stringClass1.isArray());
        System.out.println("is primitive " + stringClass1.isPrimitive());
        System.out.println("is primitive " + intClass.isPrimitive());


        // inspect Animal class
        Class<?> dogClass = Dog.class;

        //basic information
        System.out.println("basic info for our custom class");
        System.out.println("Class Name " + dogClass.getName());
        System.out.println("package name " + dogClass.getPackage().getName());
        System.out.println("simple name "+ dogClass.getSimpleName());
        System.out.println("super class details " + dogClass.getSuperclass().getName());

        // inspect access modifiers
        int modifiers = dogClass.getModifiers();
        System.out.println("Modifiers " + Modifier.toString(modifiers));
        System.out.println("is public  " + Modifier.isPublic(modifiers));
        System.out.println("is protected" + Modifier.isProtected(modifiers));
        System.out.println("is private" + Modifier.isPrivate(modifiers));
        System.out.println("is final" + Modifier.isFinal(modifiers));
        System.out.println("is abstract" + Modifier.isAbstract(modifiers));

        //interfaces
        Class<?>[] interfaces = dogClass.getInterfaces();
        System.out.println("Interfaces " + java.util.Arrays.toString(interfaces));

        //Field level inspection
        Dog dog = new Dog("Bobby",3, "Lab");

        System.out.println("inspect fields");
        // get all the declared fields(including private)
        Field[] allFields = dogClass.getDeclaredFields();
        System.out.println("printing all the fields in the class");
        for(Field field : allFields){
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
            Modifier.toString(field.getModifiers());
        }

        //get all the public fields(including inheritance)
        Field[] publicField = dogClass.getFields();
        System.out.println("public fields including inheritest super class");
        for(Field field : publicField){
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
        }
        //setting up access
        Field nameField = dogClass.getSuperclass().getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("name " + nameField.get(dog));

        // Method inspection
        System.out.println("Method reflection inspection");
        // get all the decalred methods
        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getSimpleName());
            System.out.println(method.getParameterTypes().length);
        }

        // get all the methods inhereted from super class
        System.out.println("inherited class methods from super class");
        Method[] allMethods = dogClass.getMethods();
        for(Method method : allMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getSimpleName());
        }


    }
}
