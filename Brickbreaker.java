/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brickbreaker;

/**
 *
 * @author Satakshi Tiwari
 */
import javax.swing.JFrame;
public class Brickbreaker {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame obj = new JFrame ();
        Gameplay gameplay= new Gameplay();
        obj.setSize(700,600);
        obj.setTitle("BrickBreaker");
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        
        
    }
    
}
