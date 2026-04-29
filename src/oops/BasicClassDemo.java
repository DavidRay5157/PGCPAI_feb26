package oops;

class Student{
    //properties
    private String name = "Mihir";
    private int id = 1;
    private int rollNo = 1;

    Student(){
        System.out.println("Hello i'm default constructor");
    }
    Student(String name){
        this.name = name;
    }
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    Student(String name, int id, int rollNo){
        this.name = name;
        this.id = id;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //functionalities
    void display(){
        System.out.println("name is "+name);
        System.out.println("id is "+id);
        System.out.println("roll is "+rollNo);
    }
}

public class BasicClassDemo {
    public static void main(String[] args) {
        Student s = new Student();

        Student s1 = new Student("karthik");
        s1.display();

        s1.setName("Manu");
        System.out.println("the name is " + s1.getName());
//        s1.name = "Manu";
//        s1.display();

        Student s2 = new Student("madhu", 2);
        s2.display();

        Student s3 = new Student("advaik", 3, 45);
        s3.display();
    }
}
