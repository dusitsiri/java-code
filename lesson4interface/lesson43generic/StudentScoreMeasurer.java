package lesson4interface.lesson43generic;

public class StudentScoreMeasurer implements Measurer<Student> {
    @Override
    public double measure(Student obj) {

        // safe เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Student แน่นอน
        return obj.getScore();
    }
}
