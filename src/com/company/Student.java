package com.company;

public class Student extends Person {
protected String group;

public Student(String name,int age,String group){
super(name,age);
this.group=group;
}
@Override
protected String Info(){
    return ("Студент\t\t"+name+"\t\t"+age+"\t\t"+group);
}
    @Override
    protected String GetUn(){
        return group;
    }

}
