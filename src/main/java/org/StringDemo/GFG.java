package org.StringDemo;

public class GFG {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("SkyOrcus");
        int p = s.length();
        int q = s.capacity();
       // s.append("Solution");
        s.insert(8,"Solution");
        System.out.println("Length is = "+p);
        System.out.println("Capacity is = "+q);
        System.out.println(s);


    }
}
