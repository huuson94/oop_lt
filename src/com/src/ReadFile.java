/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/**
 *
 * @author hs
 */
public class ReadFile extends JFrame {
    private JTextField addressBar;
    private JEditorPane display;
    
    //constructor
    public ReadFile(){
        super("HS Browser");
        
        addressBar = new JTextField("");
    }
}
