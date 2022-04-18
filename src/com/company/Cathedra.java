package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Cathedra {
    protected ArrayList <Person> people = new ArrayList <Person>();

    public Cathedra(){
        people.add(new Student("Иванов Михаил",19,"ИСТб-20-2"));
        people.add(new Student("Соломатин Артём",19,"ИСТб-19-3"));
        people.add(new Teacher("Попова Светлана",40,"Математика"));
        people.add(new Zavkafedroy("Владимир Панин",60,30));
        people.add(new Teacher("Ирина Черницкая",40,"Философия"));
    }


 public void SearchType(){
    // Scanner in = new Scanner(System.in);
     int n,t;
   //  String s;
     System.out.print("По какому полю осуществить поиск?\n" +
             "1.Студент" +
             "\n2.Учитель" +
             "\n3.Зафкафедрой\n");
     t = Menu.Number("123");
     n=0;
     switch (t){
         case 1:
             for (int i = 0; i < people.size(); i++)
             {
                 Person element = people.get(i);
                 if(element instanceof Student)
                 {
                     if(n==0)
                     {
                         System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                         n++;
                     }
                     System.out.println(i+1+"\t"+element.Info());

                 }
             }
             if(n==0)
             {
                 System.out.println("Элементов с указанным типом не найдено");
             }
             break;
         case 2:
             for (int i = 0; i < people.size(); i++)
             {
                 Person element = people.get(i);
                 if(element instanceof Teacher)
                 {
                     if(n==0)
                     {
                         System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                         n++;
                     }
                     System.out.println(i+1+"\t"+element.Info());

                 }
             }
             if(n==0)
             {
                 System.out.println("Элементов с указанным типом не найдено");
             }
             break;
         case 3:
             for (int i = 0; i < people.size(); i++)
             {
                 Person element = people.get(i);
                 if(element instanceof Zavkafedroy)
                 {
                     if(n==0)
                     {
                         System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                         n++;
                     }
                     System.out.println(i+1+"\t"+element.Info());

                 }
             }
             if(n==0)
             {
                 System.out.println("Элементов с указанным типом не найдено");
             }
             break;
     }

 }
    public void Search() {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        System.out.print("По какому полю осуществить поиск?\n" +
                "1.Тип" +
                "\n2.Имя" +
                "\n3.Возраст" +
                "\n4.Группа/стаж/предмет преподования\n");
        n = Menu.Number("1234");
        switch (n) {
            case 1:
                SearchType();
                break;
            case 2:
                System.out.println("Введите имя для поиска: ");
                s=in.nextLine();
                s=Menu.Check(s,false);
                n=0;
                for (int i = 0; i < people.size(); i++)
                {
                    Person element = people.get(i);
                    if(s.equals(element.name)==true)
                    {
                        if(n==0)
                        {
                            System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                            n++;
                        }
                        System.out.println(i+1+"\t"+element.Info());

                    }
                }
                if(n==0)
                {
                    System.out.println("Элементов с указанным именем не найдено");
                }
                break;
            case 3:
                System.out.println("Введите возраст для поиска: ");
                s=in.nextLine();
                s=Menu.Check(s,true);
                n=Integer.parseInt (s);
                int t=0;
                for (int i = 0; i < people.size(); i++)
                {
                    Person element = people.get(i);
                    if(n==element.age)
                    {
                        if(t==0)
                        {
                            System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                            t++;
                        }
                        System.out.println(i+1+"\t"+element.Info());

                    }
                }
                if(t==0)
                {
                    System.out.println("Элементов с указанным возрастом не найдено");
                }
                break;
            case 4:
                System.out.println("Введите группу/стаж/предмет преподования для поиска: ");
                s=in.nextLine();
              //  s=Menu.Check(s,false);
                n=0;
                for (int i = 0; i < people.size(); i++)
                {
                    Person element = people.get(i);
                    if(s.equals(element.GetUn())==true)
                    {
                        if(n==0)
                        {
                            System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
                            n++;
                        }
                        System.out.println(i+1+"\t"+element.Info());

                    }
                }
                if(n==0)
                {
                    System.out.println("По вашему запросу ничего не найдено");
                }
                break;
        }
    }

    public void AddPerson (){
      //  people.add(person);
        Scanner in = new Scanner(System.in);
        int n,age,experience;
        String name,group,object;
        System.out.print("Элемент какого типа вы хотите добавить?\n" +
                "1.Студент." +
                "\n2.Учитель" +
                "\n3.Зафкафедрой\n");
        n=Menu.Number("123") ;
        switch (n)
        {
            case 1:
                System.out.println("Введите имя: ");
                name=in.nextLine();
                name=Menu.Check(name,false);
                System.out.println("Введите возраст: ");
              //  age=in.nextInt();
                group=in.nextLine();
                group=Menu.Check(group,true);
                age=Integer.parseInt (group);
                System.out.println("Введите группу: ");
              //  group=in.nextLine();
                group=in.nextLine();
                group=Menu.Check(group,false);
                Person person1=new Student(name,age,group);
                people.add(person1);
                break;
            case 2:
                System.out.println("Введите имя: ");
                name=in.nextLine();
                name=Menu.Check(name,false);
                System.out.println("Введите возраст: ");
                group=in.nextLine();
                group=Menu.Check(group,true);
                age=Integer.parseInt (group);
                System.out.println("Введите предмет преподования: ");
               // object=in.nextLine();
                object=in.nextLine();
                object=Menu.Check(object,false);
                Person person2=new Teacher(name,age,object);
                people.add(person2);
                break;
            case 3:
                System.out.println("Введите имя: ");
                name=in.nextLine();
                name=Menu.Check(name,false);
                System.out.println("Введите возраст: ");
                group=in.nextLine();
                group=Menu.Check(group,true);
                age=Integer.parseInt (group);
                System.out.println("Введите стаж: ");
            //    experience=in.nextInt();
                group=in.nextLine();
                group=Menu.Check(group,true);
                experience=Integer.parseInt (group);
                Person person3=new Zavkafedroy(name,age,experience);
                people.add(person3);
                break;
        }
    }

    public void DelPerson (){
       // people.remove(person);
        OutputList ();
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Введите номер элемента который вы хотите удалить: ");
        s=in.nextLine();
        s=Menu.Check(s,true);
        n=Integer.parseInt (s);
     //   n = in.nextInt();
        for (int i = 0; i < people.size(); i++) {
           // Person element = people.get(i);
           // people.remove(element);
            if(n-1==i){
            people.remove(people.get(n-1));
            break;
            }
        }
        OutputList ();
    }

    public void OutputList (){
        System.out.println("№\tТип:\t\tИмя:\t\t\tВозраст:\tГруппа/стаж/предмет преподования:");
        int i=1;
        for(Person person: people)
        {
            System.out.println(i+"\t"+person.Info());
            i++;
        }
        System.out.println();

        /*
        for (int i = 0; i < people.size(); i++) {
            Person element = people.get(i);
            System.out.println(element.Info());
        }
        */
    }
}
