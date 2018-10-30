package lesson1designatm.version1;

public class ATMMain {
    public static void main(String[] args) {
        ATMSimulator atmSim = new ATMSimulator();
        atmSim.setup();
        atmSim.run();
    }
}
