package com.company;

public abstract class Person {
    protected String name;
    protected int age;

public Person (String name, int age){
    this.name=name;
    this.age=age;
}
protected abstract String Info();
    protected abstract String GetUn();
}
