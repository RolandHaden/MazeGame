/*
Name: Davis Haden
Date: 11-15-21
 */

import java.util.*;
import java.io.*;

/**
 * MazeTester uses recursion to determine if a maze can be traversed.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class MazeTester
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //get filename from user
        Scanner input = new Scanner(System.in);
        System.out.print("What is the filename of the maze?: ");
        String filePath = input.nextLine();
        /**
         * Creates a new maze, prints its original form, attempts to
         * solve it, and prints out its final form.
         */
        //instantiate a new Maze object with the file requested
        Maze object = new Maze(filePath);
        System.out.println("Printing out Maze");
        System.out.println(object);
        //create a MazeSolver object with the maze object
        MazeSolver solver = new MazeSolver(object);
        //call the traverse method to see if the maze can be successfully navigated
        System.out.println("The maze solver found a successful path to be " + solver.traverse());
        //state whether or not there is a path to success.
        //print the final state of the Maze object
        System.out.println(object);
    }
}
