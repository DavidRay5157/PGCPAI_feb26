package oops;

interface payable{
    int a = 10;
    void calculatePay();
}
interface printable{
    void show();
}
class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class StudentOfPgcp extends Person{
    private int id;
    StudentOfPgcp(String name, int age, int id){
        super(name, age);
        this.id = id;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("ID is " + id);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Professor extends Person implements payable,printable{
    private int employeeId;
    private double salary;
    Professor(String name, int age, int employeeId, double salary){
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("ID is " + employeeId);
        System.out.println("Salary is " + salary);
    }
    @Override
    public void calculatePay(){
        this.salary = this.salary + salary*0.1;
    }
    @Override
    public void show(){
        System.out.println("updated salary for employee id " + this.employeeId + " is " + (salary+100));
    }

}
public class CollegeLms {
    public static void main(String[] args) {
        StudentOfPgcp s1 = new StudentOfPgcp("david", 18, 1);
        s1.display();

        Professor p1 = new Professor("Mihir", 45, 1002, 2000);
        p1.display();
        p1.calculatePay();
        p1.show();

    }
}
