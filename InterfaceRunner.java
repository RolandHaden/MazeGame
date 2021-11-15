/*
Name: Davis Haden
Date: 11-15-21
Desc: Displays the maze solver through a GUI.
 */

import javax.swing.*;
import java.io.FileNotFoundException;

public class InterfaceRunner {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame("Maze Solver");
        MazePanel panel = new MazePanel("testfile3.txt");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
