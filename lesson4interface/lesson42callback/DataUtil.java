package lesson4interface.lesson42callback;

public class DataUtil {

    /**
     * This method can be used to calculate average of any values
     * of any class as long as Measurer object is specified in
     * the parameter of the method.
     *
     * meas.measure(e) is a callback method that returns desired
     * value to be calculated
     *
     * @param elements contains data needed to calculate average
     * @param meas ตัววัดค่า/คืนค่าที่ต้องการจาก object ใน elements
     * @return average value of elements measured by meas
     */
    public static double average(Object[] elements, Measurer meas) {
        double result = 0;
        for (Object e : elements) {
            result += meas.measure(e);  // polymorphism
        }
        if (elements.length != 0) {
            return result/elements.length;
        }
        return 0;
    }
}

