/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busbookingapp;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author SEC
 */
public class Func {
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
   int getX(int jframeWidth){
        int x = (dim.width - jframeWidth)/2;
        return x;
   }   
    
   int getY(int jframeHeight){
       int y = (dim.height - jframeHeight)/2;
       return y;
   }
}
