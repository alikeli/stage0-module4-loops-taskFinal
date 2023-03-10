package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + i*numberTableToPrint);
        }


    }

    public static void main(String[] args) {
        MultiplicationTable m= new MultiplicationTable();
        m.printTable(5);
    }
}
