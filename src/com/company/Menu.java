package com.company;
import jdk.nashorn.internal.runtime.NumberToString;

import java.io.*;
import java.util.Scanner;

public class Menu {

   static Cathedra spisok=new Cathedra();

    static void outMenu() {
        Scanner in = new Scanner(System.in);
         int n;
        boolean check = true;
        String s="", cr;
      //  Cathedra spisok=new Cathedra();

        while (check == true)
        {

            System.out.print("Выберите пункт меню:\n" +
                    "1.Вывести список на экран" +
                    "\n2.Добавить элемент в список" +
                    "\n3.Удалить элемент списка"+
                    "\n4.Поиск"+
                    "\n5.Завершить программу.\n");

             n=Number("12345") ;
            switch (n)
            {
                case 1:
                    spisok.OutputList();
                    break;
                case 2:
                  //  Add();
                    spisok.AddPerson();
                    break;
                case 3:
                    spisok.DelPerson();
                    break;
                case 4:
                    spisok.Search();
                    break;
                case 5:
                    check=false;
                    break;
            }
        }
    }


    static String Check(String s,boolean arr)
    {
        Scanner in = new Scanner(System.in);
        boolean t=false;
        if(arr==false)
        {
            String check="АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЭЮЯабвгдеёжзийклмнопрстуфхцчшщэюя ";
            while(t==false)
            {
                for (int i = 0; i < s.length(); i++)
                {
                    if ((check.indexOf(s.charAt(i)) == -1))
                    {
                        System.out.println("Некорректный ввод.Повторите ввод ");
                        s = in.nextLine();
                        break;
                    }
                    else
                    {
                        t = true;
                    }
                }

            }
        }
        else
        {
            String check_2 = "1234567890";
            while (t == false)
            {
                for (int i = 0; i < s.length(); i++)
                {
                    if ((check_2.indexOf(s.charAt(i)) == -1))
                    {
                        System.out.println("Некорректный ввод.Повторите ввод ");
                        s = in.nextLine();
                        break;
                    }
                    else
                    {
                        t = true;
                    }
                }
            }
        }
        return s;
    }

    static int Number(String cr)
    {
        Scanner in = new Scanner(System.in);
        int n=1;
        boolean check_1=true;
        String s;
        while(check_1==true)
        {
            s = in.nextLine();
            if(cr.indexOf(s.charAt(0))!=-1 & s.length()==1)
            {
                check_1=false;
                n=Integer.parseInt (s.trim ());
            }
            else
            {
                System.out.println("Некорректный ввод. Повторите ввод");
            }
        }
        return n;
    }

}

