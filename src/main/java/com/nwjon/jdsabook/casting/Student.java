package com.nwjon.jdsabook.casting;

/**
 * Created by jondann on 7/19/16.
 */
public class Student implements Person {

    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    protected int studyHours(){
        return age / 2;
    }

    public boolean equals(Person other) {

        if (!(other instanceof Student)) {
            return false;
        }

        Student s = (Student) other;
        return id.equals(s.getId());

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
