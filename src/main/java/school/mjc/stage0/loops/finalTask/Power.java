package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int s = (int) Math.pow(numberToPrint, power);
        System.out.println(s);
        }


    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
