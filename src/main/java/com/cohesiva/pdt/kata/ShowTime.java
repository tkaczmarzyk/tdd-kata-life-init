package com.cohesiva.pdt.kata;

import jline.console.ConsoleReader;


public class ShowTime {

    public static void main(String... args) throws Exception {
//        Generation gen = Generation.forRows(
//                ".*.",
//                "..*",
//                "***");
        
        ConsoleReader r = new ConsoleReader();
        
        for (int i = 0; i < 130; i++) {
            r.clearScreen();
//            r.println(gen.render(0,0, 20,20).replace('.', ' ').replace('*', '#'));
            r.println("\n\n");
            r.flush();
//            gen = gen.next();
            Thread.sleep(150);
        }
    }
}
