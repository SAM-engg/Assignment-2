package testpackage;

import college.students.Student;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Accessing public: " + s.name);

        System.out.println("\nCalling display() method from Student class:");
        s.display();
    }
}
