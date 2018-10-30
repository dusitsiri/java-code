package lesson4interface.lesson41simpleinterface;

public class DataUtil {

    /**
     * Interface helps code reuse. We can calculate average for
     * Circle, Country, Student objects using only one average method
     *
     * @param elements
     * @return average value of specified elements
     */
    public static double average(Measurable[] elements) {
        double result = 0;
        for (Measurable e : elements) {
            result += e.getMeasure();  // polymorphism
        }
        if (elements.length != 0) {
            return result/elements.length;
        }
        return 0;
    }

}

