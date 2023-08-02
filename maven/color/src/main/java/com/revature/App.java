package com.revature;

import static com.diogonunes.jcolor.Attribute.*;

import com.diogonunes.jcolor.Ansi;

/**
 * Hello world!
 *
 */
public class App 
{
    //ANSI string the represents purple and to reset the color back to normal (This takes a long time)
    //List of colors can be fount here: https://en.wikipedia.org/wiki/ANSI_escape_code
    //Instead of hardcoding the colors, we could create a dependency in the POM.xml
    //An example of a pre-made library we could pull from is: https://github.com/dialex/JColor
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( ANSI_PURPLE + "Hello World!" );
        System.out.println( "Hello World!" + ANSI_RESET );
        System.out.println( "Hello World!" );

        System.out.println(Ansi.colorize("Hello World!", GREEN_TEXT(), MAGENTA_BACK()));
    }
}
