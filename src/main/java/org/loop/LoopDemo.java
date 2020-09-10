package org.loop;

import java.util.ArrayList;
import java.util.List;

public class LoopDemo {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //Simple For Loop
        System.out.println();
        System.out.println("Simple For Loop");
        for(String item : items) {
            System.out.print(item);
        }
        System.out.println();
        // Loop with Expression
        System.out.println("Lambda Expression");
        items.forEach(item-> System.out.println(item));


        //  Loop with output C:
        System.out.println("Output with :C");
        items.forEach(item->{
            if("C".equals(item)) {
                System.out.println(item);
            }
        });

        // Method with Reference....
        System.out.println("Method with Reference");
        items.forEach(System.out::println);

        // Stream with Filter.....]
        items.stream()
                    .filter(s->s.contains("A"))
                    .forEach(System.out::println);
    }
}
