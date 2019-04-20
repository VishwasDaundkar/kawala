	package sample_group.sample_artifact;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        System.out.println( "Hello World!" );
        
        while(true) {
        	System.out.println("Please Enter your name:-");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your name is : "+scanner.nextLine());
        }
        
    }
}
