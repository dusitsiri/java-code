package lesson4interface.lesson46informationhiding.internal;


import lesson4interface.lesson46informationhiding.external.StatApp;

public class MainInfoHiding {

    // interface StudentProvinceYear helps hide some
    // information in Student objects in the parameter
    // since StatApp cannot access non-public class Student
    // thus cannot access any other methods
    //
    // (Using interface to hide information is just one way
    //  to do it. There are other ways to hide information
    //  such as using encapsulation with private access modifers.)


    public static void main(String[] args) {
        Student[] students = {
                new Student("A", "1111", 1, "Bangkok"),
                new Student("B", "2222", 1, "Nonthaburi"),
                new Student("C", "3333", 2, "Ayuthaya")
        };

        StatApp app = new StatApp();
        app.display(students);
    }
}
