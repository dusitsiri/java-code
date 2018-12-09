package classdesign_2018.test;

public class Main {
    public static void main(String[] args) {
        Measurable m = new Student("Kwan", 18);
        System.out.println(((Student) m).getAge());
    }
}
