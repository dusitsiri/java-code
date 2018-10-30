package lesson4interface.lesson42callback;

public class MainCallback {

    public static void main(String[] args) {
        Student[] students = {new Student("A"), new Student("B"),
                new Student("C")};
        students[0].setScore(1);
        students[1].setScore(2);
        students[2].setScore(3);

        double stdAvg = DataUtil.average(students, new StudentScoreMeasurer());
        System.out.println("Student Score Average: "+stdAvg);

        Circle[] circles = {new Circle(4), new Circle(5),
                new Circle(6)};

        double circleAvg = DataUtil.average(circles, new CircleRadiusMeasurer());
        System.out.println("Circle Radius Average: "+circleAvg);

        Country[] countries = {
                new Country("Thailand", 500000, 66, 1.2),
                new Country("USA", 2000000, 300, 18),
                new Country("UK", 600000, 50, 15) };

        double countryAreaAvg = DataUtil.average(countries, new CountryAreaMeasurer());
        System.out.println("Country Area Average: "+countryAreaAvg);

        double countryPopAvg = DataUtil.average(countries, new CountryPopulationMeasurer());
        System.out.println("Country Population Average: "+countryPopAvg);

        // ใช้ student objects แต่ measurer เป็นของ Country
        // ทำให้เกิด Runtime Exception เพราะมีการ cast แบบไม่ safe
        // สามารถแก้ได้โดยใช้ generic เข้าช่วย
        double runtimeErrorExample = DataUtil.average(students, new CountryAreaMeasurer());

    }
}
