package lesson4interface.lesson46informationhiding.external;


import lesson4interface.lesson46informationhiding.internal.StudentProvinceYear;

public class StatApp {

    // interface StudentProvinceYear helps hide some
    // information in Student objects in the parameter
    // since StatApp cannot access non-public class Student
    // thus cannot access any other methods
    //
    // (Using interface to hide information is just one way
    //  to do it. There are other ways to hide information
    //  such as using encapsulation with private access modifers.)

    public void display(StudentProvinceYear[] students) {

        // plot graph --- province, year
        for (StudentProvinceYear s : students) {
            System.out.println(s.getProvince() + " " + s.getYear());
        }
    }
}
