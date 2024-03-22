package com.javalearnings.jdbc;


public class SubhaEntity {

    private int id;
    private String name;

    private int age;
    private String department;

    public SubhaEntity(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "SubhaEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
