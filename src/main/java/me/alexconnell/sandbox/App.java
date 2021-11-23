package me.alexconnell.sandbox;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String myString = "Hi there everybody!";
        int lineN = 1 ;

        for (String word : myString.split(" ")){
            System.out.print(lineN+" ");
            System.out.println(word);
           lineN++; 
        }


    }
}
