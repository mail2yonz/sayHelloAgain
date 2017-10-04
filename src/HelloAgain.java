import java.util.Scanner;

public class HelloAgain {

    //this is a code that displayes Hello in different language

    public static void main(String[] args)
    {
        String name,language;
        System.out.println("Please Enter your name :");

        Scanner scan = new Scanner (System.in);
        name= scan.nextLine ();
        System.out.println("Please Enter the language:");
        scan= new Scanner(System.in);
        language= scan.nextLine ();

     System.out.println(Hello ( name,language ));

    }
    public static String Hello(String name, String language)
    {

        if(language.equalsIgnoreCase ( "English" ))
        {
            return "Hello, "+name + "!";
        }  else if(language.equalsIgnoreCase ( "French" ))
        {
            return "Bonjour, " + name + "!";
        } else if(language.equalsIgnoreCase ( "Twi" ))
    {
        return "Mahai, "+ name+"!";
    } else if(language.equalsIgnoreCase ( "Afaanoromo" ))
    {
        return "Akam,  "+ name + "!";
    }
     return "Done";
    }
}
