package hu.webler.model;

public class Student extends Person {

    private String firstName;
    private String lastName;
    private int age;

    private static int counter;

    public Student() {
        this("", "", 0);
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName);
        this.lastName = lastName;
        this.age = age;
        counter++;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static int getCounter() {
        return counter;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + super.getFirstName() + '\'' +
                ", lastname='" + lastName + '\'' +
                ", age='" + age + '\'' + '\'' +
                ", counter='" + counter + '\'' +
                '}';
    }

}
