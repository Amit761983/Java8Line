package org.StringDemo.hashcodEqualDemo;

public class HashCodeEqual {

    public static void main(String[] args) {

        Student s1 = new Student(1,"Alex");
        Student s2 = new Student(1,"Alex");

        System.out.println("alex1 hashcode : "+ s1.hashCode());
        System.out.println("alex2 hashcode : " + s2.hashCode());
        System.out.println("Checking Equality of between s1 and s2 :"+s1.equals(s2));
    }
}
