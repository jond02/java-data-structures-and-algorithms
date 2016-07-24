package com.nwjon.jdsabook.casting;

/**
 * Created by jondann on 7/19/16.
 */
public class CastingMain {

    public static void main(String[] args) {

        Student student = new Student("10", "guy", 20);

        Student student1 = new Student("11", "b", 20);

        System.out.println(student.equals(student1));

    }
}
