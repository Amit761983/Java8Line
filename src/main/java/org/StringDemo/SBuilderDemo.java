package org.StringDemo;

public class SBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sky");
        sb.append("orcus");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.hashCode());

    }
}
