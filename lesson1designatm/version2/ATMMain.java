package lesson1designatm.version2;

public class ATMMain {
    public static void main(String[] args) {
        ATMSimulator atmSim = new ATMSimulator();
        atmSim.setup();
        atmSim.run();
    }
}
