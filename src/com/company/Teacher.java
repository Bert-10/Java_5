package com.company;

public class Teacher extends Person{
    protected String object;

    public Teacher(String name,int age,String object){
        super(name,age);
        this.object=object;
    }
    @Override
    protected String Info(){
        return ("Учитель\t\t"+name+"\t\t"+age+"\t\t"+object);
    }
    @Override
    protected String GetUn(){
        return object;
    }

}
