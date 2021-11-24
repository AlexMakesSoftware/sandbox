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
        int indent = 0 ;

        for (String word : myString.split(" ")){
            System.out.println(word);
            for(int i = 0; i<=indent; i++){
            System.out.print("\t");
            }
            indent++;
        }


    }
}
