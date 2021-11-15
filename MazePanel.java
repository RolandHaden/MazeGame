/*
Name: Davis Haden
Date: 11-15-21
 */

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class MazePanel extends JPanel {
    public MazePanel(String filePath) throws FileNotFoundException {
        Maze object = new Maze(filePath);
        int rowLength = object.getRows();
        int columnLength = object.getColumns();
        JPanel[][] displayPanel = new JPanel[rowLength][columnLength];
        JPanel mazePanel = new JPanel();
        mazePanel.setPreferredSize(new Dimension(columnLength*10, rowLength*10));
        mazePanel.setMaximumSize(new Dimension(columnLength*10, rowLength*10));
        mazePanel.setLayout(new GridLayout(rowLength, columnLength));
        mazePanel.setBorder(BorderFactory.createLineBorder(Color.white));
        mazePanel.setOpaque(false);
        MazeSolver solver = new MazeSolver(object);
        solver.traverse();
        System.out.println(object);
        for(int row = 0; row < object.grid.length; row++){
            for(int column = 0; column < object.grid[row].length; column++){
                if(object.grid[row][column] == 0){
                    displayPanel[row][column] = new JPanel();
                    displayPanel[row][column].setBackground(Color.black);
                    //displayPanel[row][column].setPreferredSize(new Dimension(10, 10));
                    //displayPanel[row][column].setMaximumSize(new Dimension(10, 10));
                    mazePanel.add(displayPanel[row][column]);
                }
                if(object.grid[row][column] == 1){
                    displayPanel[row][column] = new JPanel();
                    displayPanel[row][column].setBackground(Color.white);
                    //displayPanel[row][column].setPreferredSize(new Dimension(10,10));
                    //displayPanel[row][column].setMaximumSize(new Dimension(10,10));
                    mazePanel.add(displayPanel[row][column]);
                }
                if(object.grid[row][column] == 2){
                    displayPanel[row][column] = new JPanel();
                    displayPanel[row][column].setBackground(Color.green);
                    //displayPanel[row][column].setPreferredSize(new Dimension(10,10));
                    //displayPanel[row][column].setMaximumSize(new Dimension(10,10));
                    mazePanel.add(displayPanel[row][column]);
                }
            }
        }
        add(mazePanel);
        setBackground(new Color(139, 177, 241));
        setPreferredSize(new Dimension(500,500));
    }
}
