/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tictactoe extends JFrame {

    JPanel p= new JPanel();
    
    public static void main(String[] args) {
       
    JFrame Tictactoe= new TictactoeFrame();
    Tictactoe.setTitle("TicTacToe Game!");
    Tictactoe.setSize(600,600);
    Tictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tictactoe.setLocationRelativeTo(null);
    Tictactoe.setVisible(true); // nimic
    
    }
    
}
