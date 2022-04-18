package com.company;

public class Zavkafedroy extends Person {
    protected int experience;

    public Zavkafedroy (String name,int age,int experience){
        super(name,age);
        this.experience=experience;
    }
    @Override
    protected String Info(){
        return ("Зафкафедрой\t"+name+"\t\t"+age+"\t\t"+experience);
    }
    @Override
    protected String GetUn(){
        return Integer.toString(experience);
    }
}
