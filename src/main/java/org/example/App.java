package org.example;


public class App 
{
    public static void main( String[] args )
    {
        String java = Data.length("JAVA");
        String poss = Data.possition("Long example sentence");
        String poss2 = Data.possition2("Even longer example sentence");
        String task3 = Data.sub("Ok this is not as long!");
        String task4 = Data.conv("CAPS EQUALS SCREAMING");
        String task5 = Data.replace("Java is the worst programming language!");
        String task6 = Data.output ("\tJ\ta\tv\ta\t");
        int task7 = Data.year (20);
        String task8 = Data.together ("Oil and Water");
        String task9 = Data.names ("Carl,Susie,Fredrick,Bob,Erik");
        String task10 = Data.tochararray ("ThisShouldBeConverted");

        char[] task11 = new char[] {'J','a','v','a'};
        task11 = Data.toAstring(task11);

    }
}
