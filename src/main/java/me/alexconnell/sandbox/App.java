package me.alexconnell.sandbox;

import me.alexconnell.sandbox.utils.Colouriser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for(int x=0;x<10;x++) {
            System.out.println(
                new Colouriser()
                    .green("Hi ")
                    .cyan("there ")
                    .red("everybody")
                    .yellow("!")
            );
        }
    }
}
