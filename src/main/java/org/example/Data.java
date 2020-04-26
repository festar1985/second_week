package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Data
{
public static String length (String string)
{
    System.out.println("The lenght of the string is : " + string.length());
    return string;
}

public static String possition (String string)
{
    System.out.println("The letter on possition 6 is :" + string.charAt(6));
    return string;
}
public static String possition2 (String string)
{
    System.out.println("The possition of o is :" + string.indexOf("o"));
    return string;
}
public static String sub (String string)
{
    System.out.println(string.substring(11,22));
    return string;
}
public static String conv (String string)
{
    System.out.println(string.toLowerCase());
    System.out.println(string.toUpperCase());
    return string;
}
public static String replace (String string)
{
    System.out.println(string.replace("worst", "best"));
    return string;
}
public static String output (String string)
{
    System.out.println(string.trim());
    return string;
}
public static int year (int number)
{
    String thenumber = Integer.toString(number);
    System.out.println("20"+thenumber);
    return number;
}
public static String together (String string)
{
    String oil = string.substring(0,3);
    String water = string.substring(8,13);

    String[] myarray = new String[] {oil,water};

    return string;
}
public static String names (String string)
{
    String name1 = string.substring(0,4);
    String name2 = string.substring(5,10);
    String name3 = string.substring(11,19);
    String name4 = string.substring(20,23);
    String name5 = string.substring(24,28);

    String[] nameArray = new String[] {name1,name2,name3,name4,name5};
    for (String name: nameArray)
    {
        System.out.println(name);
    }

    return string;
}

public static String tochararray (String string)
{
    char[] chararray = new char[string.length()];
    for (int i=0; i<string.length(); i++)
     {
       chararray[i] = string.charAt(i);
     }

    for (char ch: chararray)
    {
      System.out.print(ch+" ");
    }
    System.out.println();
    return string;
}

public static char[] toAstring(char[] chararray)
{
    String string = Arrays.toString(chararray);
    System.out.println(string);

    return chararray;
}


}
