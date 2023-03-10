package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int t = 1; t <= cathetusLength; t++)
            System.out.printf("%" + cathetusLength + "s%n", new String(new char[t]).replace("\0", "*"));

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
