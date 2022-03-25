package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker(3645, "Schmidt");
        workers[1] = new Worker(8376, "Huber");
        workers[2] = new Worker(2637, "Oswald");
        workers[3] = new Worker(5647, "Roth");
        workers[4] = new Worker(8576, "Aigner");

        for(Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();

        Arrays.sort(workers);

        for(Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
